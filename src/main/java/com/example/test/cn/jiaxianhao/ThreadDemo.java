package com.example.test.cn.jiaxianhao;

public class ThreadDemo extends Thread{

    public  int I =6;
    @Override
    public synchronized void run() {
        int b=I;
        System.out.println(b);
        I--;
    }
}
