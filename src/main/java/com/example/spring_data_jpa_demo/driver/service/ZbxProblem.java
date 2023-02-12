package com.example.spring_data_jpa_demo.driver.service;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Post;
import com.example.spring_data_jpa_demo.driver.annotation.JsonPath;
import com.example.spring_data_jpa_demo.driver.annotation.ParamName;
import com.example.spring_data_jpa_demo.driver.inteceptor.JsonBodyBuildInterceptor;


/**
 * @author nantian created at 2021/8/7 23:27
 */

@BaseRequest(baseURL = "http://${zbxServerIp}:${zbxServerPort}${zbxApiUrl}", interceptor = JsonBodyBuildInterceptor.class)
public interface ZbxProblem {


    /**
     * 告警列表
     *
     * @param hostId
     * @return String
     */
    @Post
    @JsonPath("/problem/problem.get")
    String getProblem(@ParamName("hostId") String hostId,
                      @ParamName("timeFrom") Long timeFrom,
                      @ParamName("timeTill") Long timeTill,
                      @ParamName("recent") String recent,
                      @ParamName("severity") String severity);

    @Post
    @JsonPath("/problem/problem.event.get")
    String getEventProblem(@ParamName("hostId") String hostId,
                           @ParamName("timeFrom") Long timeFrom,
                           @ParamName("timeTill") Long timeTill,
                           @ParamName("recent") String recent);

    @Post
    @JsonPath("/problem/problem.acknowledgement")
    String acknowledgement(@ParamName("eventId") String eventId, @ParamName("action") int action);
}
