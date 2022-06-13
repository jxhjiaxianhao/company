package com.example.test;


import com.example.test.cn.JiaXianHao;
import com.example.test.cn.Son;
import com.example.test.cn.User;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.RequestTimeoutException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.vpcep.v1.VpcepClient;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointServiceRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.PortList;
import com.huaweicloud.sdk.vpcep.v1.region.VpcepRegion;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.core.ApplicationContext;
import org.apache.ibatis.reflection.ArrayUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.util.ArrayUtils;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;


@SpringBootTest
@Slf4j
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
        BigDecimal bigDecimal = new BigDecimal("0.67999");
        /**
         * 向上取证,保留小数点后两位
         */
        double doubleNum = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(doubleNum);

        /**
         * 向下取整,保留小数点后两位
         */
        double doubleNum1 = bigDecimal.setScale(2, BigDecimal.
                ROUND_FLOOR).doubleValue();
        System.out.println(doubleNum1);

        int i =10;
        double d =i;
        System.out.println(i);
        System.out.println(d);
    }


    /**
     * case穿透(以匹配到的位置开始到break结束)
     */
    @Test
    void show(){

        int i = 1 == 2 ? 3 : 4;
        System.out.println(i);
        switch (6){
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

        com.example.test.cn.jiaxianhao.User user =new com.example.test.cn.jiaxianhao.User();
        CommandLineRunner show = user.show();
        show.run("s");
        System.out.println(user);
    }
}
