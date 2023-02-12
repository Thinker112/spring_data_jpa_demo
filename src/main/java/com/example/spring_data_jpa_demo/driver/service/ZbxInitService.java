package com.example.spring_data_jpa_demo.driver.service;

import com.dtflys.forest.annotation.Post;
import com.example.spring_data_jpa_demo.driver.annotation.JsonPath;
import com.example.spring_data_jpa_demo.driver.annotation.ParamName;
import com.example.spring_data_jpa_demo.driver.inteceptor.JsonBodyBuildInterceptor;


/**
 * @author nantian created at 2021/8/26 12:20
 */

public interface ZbxInitService {

    @Post(
            url = "http://${zbxServerIp}:${zbxServerPort}${zbxApiUrl}",
            headers = "authTag: noAuth",
            interceptor = JsonBodyBuildInterceptor.class
    )
    @JsonPath("/usergroup/cookieUserGroupCreate")
    String createCookieUserGroup(@ParamName("hostGroupId") String hostGroupId, @ParamName("userAuth") String userAuth);

    @Post(
            url = "http://${zbxServerIp}:${zbxServerPort}${zbxApiUrl}",
            headers = "authTag: noAuth",
            interceptor = JsonBodyBuildInterceptor.class
    )
    @JsonPath("/usergroup/cookieUserGroupGet")
    String getCookieUserGroup(@ParamName("userAuth") String userAuth);

    @Post(
            url = "http://${zbxServerIp}:${zbxServerPort}${zbxApiUrl}",
            headers = "authTag: noAuth",
            interceptor = JsonBodyBuildInterceptor.class
    )
    @JsonPath("/user/cookieUserGet")
    String getCookieUser(@ParamName("userAuth") String userAuth);

    @Post(
            url = "http://${zbxServerIp}:${zbxServerPort}${zbxApiUrl}",
            headers = "authTag: noAuth",
            interceptor = JsonBodyBuildInterceptor.class
    )
    @JsonPath("/user/cookieUserAdd")
    String createCookieUser(@ParamName("usrGrpId") String usrGrpId,
                            @ParamName("userAuth") String userAuth,
                            @ParamName("roleId") String roleId);

    @Post(
            url = "http://${zbxServerIp}:${zbxServerPort}${zbxApiUrl}",
            headers = "authTag: noAuth",
            interceptor = JsonBodyBuildInterceptor.class
    )
    @JsonPath("/role/adminRole.get")
    String getAdminRole(@ParamName("userAuth") String zbxApiToken);

    @Post(
            url = "http://${zbxServerIp}:${zbxServerPort}${zbxApiUrl}",
            headers = "authTag: noAuth",
            interceptor = JsonBodyBuildInterceptor.class
    )
    @JsonPath("/role/guestRole.get")
    String getGuestRole(@ParamName("userAuth") String zbxApiToken);
}
