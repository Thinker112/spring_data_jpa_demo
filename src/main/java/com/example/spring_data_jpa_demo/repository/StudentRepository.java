package com.example.spring_data_jpa_demo.repository;

import com.example.spring_data_jpa_demo.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yyb
 * @create 2022-12-27 23:48
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
