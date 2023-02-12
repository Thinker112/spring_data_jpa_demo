package com.example.spring_data_jpa_demo.entity;

import lombok.Data;

import java.util.Map;

@Data
public class RequestEntity {
    private String jsonrpc;

    private String method;

    private Integer id;

    private String auth;

    private Map<String, Object> params;

}
