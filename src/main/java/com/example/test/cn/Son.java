package com.example.test.cn;

import java.util.Map;

public class Son<X> extends Father{

    public static final ThreadLocal<Integer> i=new ThreadLocal<>();
    public static Integer integer =1;
    public  final String name ="111";
    public  static final Boolean kG =false;
    public final boolean conclusion1 =true;
    int j =9;
    public void show111(){
        int j =0;
        if(true){

        }
    }

    public static Integer getInteger() {
        return integer;
    }

    public static void setInteger(Integer integer) {
        Son.integer = integer;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean iskG() {
        return kG;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public boolean isConclusion1() {
        return conclusion1;
    }

     public  Map<String,String> map;


}
