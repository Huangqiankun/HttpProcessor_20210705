package com.example.httpprocessor_20210705.httpprocessor;

import com.example.httpprocessor_20210705.annotation.BindOkhttp;
import com.example.httpprocessor_20210705.annotation.BindVolley;
import com.example.httpprocessor_20210705.annotation.BindXUtils;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@Module
@InstallIn(ApplicationComponent.class)
public abstract class HttpProcessorModule {

    @BindOkhttp
    @Binds
    @Singleton
    abstract IHttpProcessor bindOkhttp(OkHttpProcessor okHttpProcessor);


    @BindVolley
    @Binds
    @Singleton
    abstract IHttpProcessor bindVolley(VolleyProcessor volleyProcessor);

    @BindXUtils
    @Binds
    @Singleton
    abstract IHttpProcessor bindXUtils(XUtilsProcessor xUtilsProcessor);
}
