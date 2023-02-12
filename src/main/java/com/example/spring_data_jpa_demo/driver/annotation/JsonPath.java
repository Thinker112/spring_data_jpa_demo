package com.example.spring_data_jpa_demo.driver.annotation;

import java.lang.annotation.*;

/**
 * @author nantian
 * <p>
 * 指定接口文件 路径
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface JsonPath {

    String value() default "";
}
