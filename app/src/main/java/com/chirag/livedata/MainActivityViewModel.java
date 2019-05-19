package com.chirag.livedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    MutableLiveData<Integer> liveData = new MutableLiveData<>();

    public MutableLiveData<Integer> getLiveData() {
        return liveData;
    }

    /**
     * initialise value
     */
    private int initialValue = 0;

    public void getInitialValue() {
        liveData.setValue(initialValue);
    }

    public void getCurrentValue() {
        liveData.setValue(initialValue += 1);
    }
}
