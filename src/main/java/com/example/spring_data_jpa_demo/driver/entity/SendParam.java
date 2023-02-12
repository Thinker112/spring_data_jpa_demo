package com.example.spring_data_jpa_demo.driver.entity;

import lombok.Data;

import java.util.List;

/**
 * @author yefei
 **/
@Data
public class SendParam {
    private List<ItemParam> params;
}
