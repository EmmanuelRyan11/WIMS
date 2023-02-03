package com.earthsky.wims.ui.laporanin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LaporanInViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LaporanInViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Laporan");
    }

    public LiveData<String> getText() {
        return mText;
    }
}