package com.example.test.cn.jiaxianhao;

public class IntImpl implements Int{
    @Override
    public String toString() {
        System.out.println(Int1.age);
        return Int1.name;
    }

    public String show1(){
        return Int1.age;
    }
}
