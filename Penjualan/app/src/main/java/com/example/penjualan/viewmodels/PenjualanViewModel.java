package com.example.penjualan.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.penjualan.models.Penjualan;

public class PenjualanViewModel extends ViewModel {
    public MutableLiveData<Double> totalHargaLiveData = new MutableLiveData<>();
    public Penjualan penjualan = new Penjualan();

    public LiveData<Double> getTotalHargaLiveData(){
        return totalHargaLiveData;
    }

    public void calculateTotal(int jumlahBuku, int harga){
        totalHargaLiveData.setValue((double) jumlahBuku * (double) harga);
    }


}