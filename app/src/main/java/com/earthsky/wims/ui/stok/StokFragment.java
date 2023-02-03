package com.earthsky.wims.ui.stok;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.earthsky.wims.databinding.FragmentStokBinding;

public class StokFragment extends Fragment {

    private FragmentStokBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StokViewModel galleryViewModel =
                new ViewModelProvider(this).get(StokViewModel.class);

        binding = FragmentStokBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textStok;
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}