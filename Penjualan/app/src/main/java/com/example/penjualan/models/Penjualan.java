package com.example.penjualan.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Penjualan implements Parcelable {
    String idPembeli, namaPembeli, judulBuku, jumlahBuku, harga;

    public Penjualan(){

    }

    public Penjualan(String idPembeli, String namaPembeli, String judulBuku, String jumlahBuku, String harga) {
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
        this.judulBuku = judulBuku;
        this.jumlahBuku = jumlahBuku;
        this.harga = harga;
    }

    public String getIdPembeli() {
        return idPembeli;
    }

    public void setIdPembeli(String idPembeli) {
        this.idPembeli = idPembeli;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(String jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    protected Penjualan(Parcel in) {
        idPembeli = in.readString();
        namaPembeli = in.readString();
        judulBuku = in.readString();
        jumlahBuku = in.readString();
        harga = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(idPembeli);
        dest.writeString(namaPembeli);
        dest.writeString(judulBuku);
        dest.writeString(jumlahBuku);
        dest.writeString(harga);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Penjualan> CREATOR = new Creator<Penjualan>() {
        @Override
        public Penjualan createFromParcel(Parcel in) {
            return new Penjualan(in);
        }

        @Override
        public Penjualan[] newArray(int size) {
            return new Penjualan[size];
        }
    };
}
