package com.example.spring_data_jpa_demo.driver.service;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Post;
import com.example.spring_data_jpa_demo.driver.annotation.JsonPath;
import com.example.spring_data_jpa_demo.driver.inteceptor.JsonBodyBuildInterceptor;


/**
 * @author nantian created at 2021/8/3 11:58
 */

@BaseRequest(
        baseURL = "http://${zbxServerIp}:${zbxServerPort}${zbxApiUrl}",
        interceptor = JsonBodyBuildInterceptor.class
)
public interface ZbxApiInfo {

    /**
     * 接口信息
     *
     * @return String apiinfo
     */
    @Post(headers = "authTag: noAuth")
    @JsonPath("/apiinfo/apiinfo")
    public String getApiInfo();
}
