package com.earthsky.wims.ui.laporanout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LaporanOutViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LaporanOutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Laporan");
    }

    public LiveData<String> getText() {
        return mText;
    }
}