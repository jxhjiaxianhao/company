package com.example.test.cn;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static Map<String,String> getMap(){
        return new HashMap<>();
    }

    public static void show(int i){
        for (int j = 0; j < 5; j++) {
            System.out.println(i);
            i++;
        }
    }

    public static void kk(int i, Son son){
        son=new Son();
        i=0;
        System.out.println(i);
        System.out.println(son);
    }
}
