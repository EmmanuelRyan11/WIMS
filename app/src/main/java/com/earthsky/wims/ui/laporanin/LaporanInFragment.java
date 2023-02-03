package com.earthsky.wims.ui.laporanin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.earthsky.wims.databinding.FragmentLaporanInBinding;

public class LaporanInFragment extends Fragment {

    private @NonNull FragmentLaporanInBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LaporanInViewModel galleryViewModel =
                new ViewModelProvider(this).get(LaporanInViewModel.class);

        binding = FragmentLaporanInBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textLaporan;
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}