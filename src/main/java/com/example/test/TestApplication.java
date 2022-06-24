package com.example.test;

import com.example.test.cn.impl.Do;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import java.util.function.Function;

@SpringBootApplication
//@MapperScan("com.example.*")
public class TestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(TestApplication.class, args);
        Object son = run.getBean("Son");
        System.out.println(son);

    }

    @Bean
    public Function<String, String> uppercase() {
        return value ->
                value.toUpperCase();
    }

    @Bean
    public Do uppercase1() {

        return () -> System.out.println("000");
    }

}
