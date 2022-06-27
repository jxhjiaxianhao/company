package com.example.test.cn.jiaxianhao;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
//import tk.mybatis.mapper.annotation.KeySql;

//import javax.persistence.*;
import java.util.UUID;

@Data
//@Table(name = "user")
public class User {
//    @Id
//    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String name;
//    @Transient
//    @Column(name = "age")
    private Integer age;

    public CommandLineRunner show(){
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                System.out.println(Builder.Default.class);
                System.out.println("222");
            }
        };
    }
}
