package com.earthsky.wims.ui.kategori;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KategoriViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public KategoriViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Kategori");
    }

    public LiveData<String> getText() {
        return mText;
    }
}