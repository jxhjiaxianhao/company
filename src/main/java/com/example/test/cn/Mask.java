package com.example.test.cn;

public enum Mask {
    YELLOW(17),
    GREEN(19);
    public int mask;
    public int age;
    Mask(int age){
        this.age=age;
    }
//    Mask(){
//        this.mask=1;
//        this.age=2;
//    }
    public int getMask(){
        return mask;
    }
    public int getAge(){
        return age;
    }
}
