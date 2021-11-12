package com.example.test.cn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Son Son(){
        return new Son();
    }
}
