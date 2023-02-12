package com.example.spring_data_jpa_demo;

import com.example.spring_data_jpa_demo.driver.service.ZbxUser;
import com.example.spring_data_jpa_demo.entity.RequestEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class ZabbixRunner implements CommandLineRunner {

//    @Autowired
//    private RestTemplate restTemplate;

    @Resource
    private ZbxUser zbxUser;

    public static String ZABBIX_TOKEN = null;

    @Override
    public void run(String... args) {
//        RequestEntity requestEntity = new RequestEntity();
//        requestEntity.setJsonrpc("2.0");
//        requestEntity.setMethod("user.login");
//        requestEntity.setId(1);
//        HashMap<String, Object> params = new HashMap<>();
//        params.put("user", "Admin");
//        params.put("password", "zabbix");
//        requestEntity.setParams(params);
//        ResponseEntity<Object> responseEntity = restTemplate.postForEntity("/", requestEntity, Object.class);
//        ObjectMapper om = new ObjectMapper();
//        Map<String, String > body = (Map<String, String>) responseEntity.getBody();
//
//        ZABBIX_TOKEN = body.get("result");
        String s = zbxUser.userLogin("Admin", "zabbix");
        log.info(s);


    }
}
