package com.example.httpprocessor_20210705.httpprocessor;

/**
 * 顶层的回调接口   json   xml   protobuf  other...
 */
public interface ICallback {
    void onSuccess(String result);
    void onFialure(String e);
}
