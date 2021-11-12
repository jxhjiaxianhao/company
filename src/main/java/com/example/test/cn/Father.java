package com.example.test.cn;

import java.util.ArrayList;
import java.util.List;

public class Father {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean show() {
        List<String> list = new ArrayList<>();
        list.add("12");
        for (String s : list) {
            if (1 != 1) {
                continue;
            }
           return true;
        }
        return false;
    }
}
