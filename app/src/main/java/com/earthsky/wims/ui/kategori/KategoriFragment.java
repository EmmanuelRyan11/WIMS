package com.earthsky.wims.ui.kategori;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.earthsky.wims.databinding.FragmentKategoriBinding;

public class KategoriFragment extends Fragment {

    private FragmentKategoriBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        KategoriViewModel slideshowViewModel =
                new ViewModelProvider(this).get(KategoriViewModel.class);

        binding = FragmentKategoriBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textKategori;
//        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}