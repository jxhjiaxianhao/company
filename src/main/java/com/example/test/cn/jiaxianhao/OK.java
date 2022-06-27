package com.example.test.cn.jiaxianhao;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class OK {
    public OK() {
    }

    public OK(String name, Integer age, boolean flag) {
        this.name = name;
        this.age = age;
        this.flag = flag;
    }

    private String name;
    private String address;
    private Integer age;
    private boolean  flag;
    private List<Map> list =new ArrayList<>();


}
