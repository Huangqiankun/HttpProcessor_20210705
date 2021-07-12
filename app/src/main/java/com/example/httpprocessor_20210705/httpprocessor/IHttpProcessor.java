package com.example.httpprocessor_20210705.httpprocessor;

import java.util.Map;

/**
 * 房产公司
 */
public interface IHttpProcessor {
    //有卖房的能力
    //网络访问的能力
    void post(String url, Map<String,Object> params,ICallback callback);
}
