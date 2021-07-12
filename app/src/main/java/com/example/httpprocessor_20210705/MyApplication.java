package com.example.httpprocessor_20210705;

import android.app.Application;

import com.example.httpprocessor_20210705.annotation.BindOkhttp;
import com.example.httpprocessor_20210705.annotation.BindVolley;
import com.example.httpprocessor_20210705.httpprocessor.IHttpProcessor;
import com.example.httpprocessor_20210705.httpprocessor.OkHttpProcessor;

import javax.inject.Inject;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class MyApplication extends Application {

    @BindOkhttp // @BindVolley  //  @BindXUtils
    @Inject
    IHttpProcessor iHttpProcessor;

    public IHttpProcessor getiHttpProcessor() {
        return iHttpProcessor;
    }

}
