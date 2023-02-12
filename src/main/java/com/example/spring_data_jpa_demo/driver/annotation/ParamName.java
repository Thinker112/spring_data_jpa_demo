package com.example.spring_data_jpa_demo.driver.annotation;


/**
 * @author nantian
 * <p>
 * 标记单个值 name
 */

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface ParamName {

    String value() default "";
}
