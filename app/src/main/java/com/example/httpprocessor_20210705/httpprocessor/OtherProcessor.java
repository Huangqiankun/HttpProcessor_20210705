package com.example.httpprocessor_20210705.httpprocessor;

import java.util.Map;

public class OtherProcessor implements IHttpProcessor{
    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        //.....
//        callback.onSuccess(xxx);
    }


}
