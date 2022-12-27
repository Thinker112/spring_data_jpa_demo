package com.example.spring_data_jpa_demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Student implements Serializable {

    @Id
    @GeneratedValue
    private Integer stuId;

    /**
    * 学生姓名
    */
    private String stuName;

    /**
    * 出生日期
    */
    private Date birthday;

    /**
    * 性别
    */
    private String sex;

    /**
    * 学生姓名
    */
    private void setStuName(String stuName){
    this.stuName = stuName;
    }

    /**
    * 出生日期
    */
    private void setBirthday(Date birthday){
    this.birthday = birthday;
    }

    /**
    * 性别
    */
    private void setSex(String sex){
    this.sex = sex;
    }

    /**
    * 学生姓名
    */
    private String getStuName(){
    return this.stuName;
    }

    /**
    * 出生日期
    */
    private Date getBirthday(){
    return this.birthday;
    }

    /**
    * 性别
    */
    private String getSex(){
    return this.sex;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                '}';
    }
}
