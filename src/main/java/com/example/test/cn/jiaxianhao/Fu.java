package com.example.test.cn.jiaxianhao;

import lombok.Data;


public class Fu {
    public String name="fu";

    public Fu() {
        System.out.println(this);
    }

    public void show(){
        name="jia";
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ex(){
        System.out.println("ex");
    }
}
