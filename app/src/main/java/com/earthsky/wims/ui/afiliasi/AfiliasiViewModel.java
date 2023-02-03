package com.earthsky.wims.ui.afiliasi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AfiliasiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AfiliasiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Afiliasi");
    }

    public LiveData<String> getText() {
        return mText;
    }
}