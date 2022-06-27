package com.example.test.cn.impl;

import lombok.Data;

@Data
public class T1 {
    @Ano(name = {})
    private String name ="fu";
    public void show1(){
        System.out.println("fu"+"::::show1");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }


    @Override
    public String toString() {
        return "T1{" +
                "name='" + name + '\'' +
                '}';
    }
}
