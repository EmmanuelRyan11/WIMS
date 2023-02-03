package com.earthsky.wims.ui.beranda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.earthsky.wims.databinding.FragmentBerandaBinding;

public class BerandaFragment extends Fragment {

    private FragmentBerandaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BerandaViewModel homeViewModel =
                new ViewModelProvider(this).get(BerandaViewModel.class);

        binding = FragmentBerandaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textBeranda;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}