package com.example.spring_data_jpa_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringDataJpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaDemoApplication.class, args);
    }

}
