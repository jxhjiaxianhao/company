package com.example.test.cn.jiaxianhao;

import lombok.Data;
import java.util.Date;

@Data
public class HHH   {

        private String name;
        private Date date;
        private Integer id;
//
//        @Data
//        public class tt{
//                private String ll;
//                public void show(){
//                        System.out.println("tt");
//                }
//        }
//
//        public tt getTt(){
//                return new tt();
//        }

        @Override
        public String toString() {
                return "HHH{" +
                        "name='" + name + '\'' +
                        ", date=" + date +
                        ", id=" + id +
                        '}';
        }
}
