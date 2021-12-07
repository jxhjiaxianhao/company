package com.example.test;


import com.example.test.cn.JiaXianHao;
import com.example.test.cn.Son;
import com.example.test.cn.User;
import org.apache.catalina.core.ApplicationContext;
import org.apache.ibatis.reflection.ArrayUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.util.ArrayUtils;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


@SpringBootTest
class TestApplicationTests {
    @Autowired
    private User userDao;

    @Test
    void contextLoads() throws IOException {
        File file = new File("E:/1");
        JiaXianHao jiaXianHao= new JiaXianHao();
        jiaXianHao.delete(file);


    }

    @Test
    void contextLoads1(){
        List<Map<String, String>> user = userDao.getUser(1);
        System.out.println(user);
        Son<String> son=new Son();
        String name = son.getName();
        Map<String, String> map = son.getMap();

        Map<String, String> map1 = com.example.test.cn.Test.getMap();
    }

    @Test
    void context(){
        int i =100;
        Son son =new Son();
        System.out.println(i);
        System.out.println(son);
        com.example.test.cn.Test.kk(i,son);

        System.out.println(i);
        System.out.println(son);
    }


    @Test
    void context22(){

        System.out.println("");
        
    }
}
