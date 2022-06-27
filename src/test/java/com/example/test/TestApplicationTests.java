package com.example.test;


import com.example.test.cn.Son;
import com.example.test.cn.User;
import com.example.test.cn.impl.Ano;
import com.example.test.cn.impl.T1;
import com.example.test.cn.impl.Us;
import com.example.test.cn.impl.Us2;
import com.example.test.cn.jiaxianhao.CardDto;
import com.example.test.cn.jiaxianhao.d1;
import com.example.test.cn.jiaxianhao.d3;
import javafx.scene.shape.Path;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;


@SpringBootTest
@Slf4j
class TestApplicationTests {
    @Autowired
    private User userDao;

    @Test
    void contextLoads() throws IOException {
        List<Map<String, String>> user = userDao.getUser(82);
        System.out.println(user);


    }

    @Test
    void contextLoads1() {
        List<Map<String, String>> user = userDao.getUser(1);
        System.out.println(user);
        Son<String> son = new Son();
        String name = son.getName();
        Map<String, String> map = son.getMap();

        Map<String, String> map1 = com.example.test.cn.Test.getMap();
    }

    @Test
    void context() {
        int i = 100;
        Son son = new Son();
        System.out.println(i);
        System.out.println(son);
        com.example.test.cn.Test.kk(i, son);

        System.out.println(i);
        System.out.println(son);
    }


    @Test
    void context22() {
        BigDecimal bigDecimal = new BigDecimal("0.67999");

        /**
         * 向上取证,保留小数点后两位
         */
        double doubleNum = bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(doubleNum);


        /**
         * 向下取整,保留小数点后两位
         */
        double doubleNum1 = bigDecimal.setScale(2, RoundingMode.FLOOR).doubleValue();
        System.out.println(doubleNum1);

        int i = 10;
        double d = i;
        double b = 1.0;
        int j = (int) b;
        System.out.println(b);
        System.out.println(j);
        System.out.println(i);
        System.out.println(d);
    }


    /**
     * case穿透(以匹配到的位置开始到break结束)
     */
    @Test
    void show() {

        int i = 1 == 2 ? 3 : 4;
        System.out.println(i);
        switch (6) {
            case 5:
                System.out.println("pppp");
            case 6:
                System.out.println("llll");
            case 7:
                System.out.println("oooo");
                break;
            case 8:
                System.out.println("kkkkk");

        }
    }


    @Test
    void show1() throws Exception {
//        CardDto c =new CardDto();
//        c.setId(12);
//        c.setAge(16);
//        int i = userDao.insert(c);
//        List<CardDto> select = userDao.select(c);
//        System.out.println(select.get(0));
        Class<T1> t1Class = T1.class;
        Field[] declaredFields = t1Class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Ano annotation = declaredField.getAnnotation(Ano.class);
            System.out.println(annotation.name());

        }

        Class<T1> t1Class1 = T1.class;
        Field[] declaredFields1 = t1Class1.getDeclaredFields();
        for (Field field : declaredFields1) {
            Ano annotation = field.getAnnotation(Ano.class);
            System.out.println(annotation.name());
        }

    }

    @Test
    void t()  {
        int i = 3 % 3;
        System.out.println(i);
        
    }
}
