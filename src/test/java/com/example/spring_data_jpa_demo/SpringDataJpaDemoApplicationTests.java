package com.example.spring_data_jpa_demo;

import com.example.spring_data_jpa_demo.entity.Student;
import com.example.spring_data_jpa_demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;

@SpringBootTest
class SpringDataJpaDemoApplicationTests {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentRepository studentRepository;

    @Test
    void contextLoads() {
        Iterable<Student> all = studentRepository.findAll();
        all.forEach(student -> {
            log.info(student.toString());
        });
    }

    @Test
    void jacksonTest(){

    }

}
