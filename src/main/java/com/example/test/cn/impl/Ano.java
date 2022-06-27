package com.example.test.cn.impl;


import java.lang.annotation.*;

/**
 * 注解中在不设置默认值时需要在使用是赋值
 * @author jiaxianhao
 * @date 2022/06/22
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Ano {
    String[] name() default {};


}
