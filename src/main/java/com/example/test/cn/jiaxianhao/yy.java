package com.example.test.cn.jiaxianhao;

import java.io.IOException;

public class yy {

    public  static int show(){
        try {
            try {
                int i =1/0;
            } catch (Exception  e) {
                e.printStackTrace();
            } finally {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return 1;
        }
    }
}
