package com.earthsky.wims.ui.stok;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StokViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StokViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Stok");
    }

    public LiveData<String> getText() {
        return mText;
    }
}