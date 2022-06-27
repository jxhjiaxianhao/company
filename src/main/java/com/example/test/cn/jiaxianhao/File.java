package com.example.test.cn.jiaxianhao;

import lombok.Data;

@Data
public class File {
    public String name;
    public int age;

    public File() {
        System.out.println("父类的无参构造方法");
    }

    public File(String name, int age) {
        System.out.println("父类的有参构造方法");
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("2222");
    }
}
