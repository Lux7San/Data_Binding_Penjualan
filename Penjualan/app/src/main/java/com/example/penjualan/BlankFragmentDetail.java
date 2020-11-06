package com.example.penjualan;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.penjualan.databinding.FragmentBlankDetailBinding;
import com.example.penjualan.models.Penjualan;
import com.example.penjualan.viewmodels.PenjualanViewModel;

public class BlankFragmentDetail extends Fragment {
    FragmentBlankDetailBinding binding;
    public PenjualanViewModel mViewModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank_detail,container,false);
        Penjualan penjualan = requireArguments().getParcelable("penjualan");
        mViewModels = new ViewModelProvider(this).get(PenjualanViewModel.class);
        binding.setPenjualan(penjualan);
        binding.setPenjualanViewModel(mViewModels);
        binding.setLifecycleOwner(this);
        mViewModels.calculateTotal(Integer.parseInt(binding.getPenjualan().getJumlahBuku()),Integer.parseInt(binding.getPenjualan().getHarga()));
        return binding.getRoot();
    }
}