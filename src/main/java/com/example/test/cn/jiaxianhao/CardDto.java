package com.example.test.cn.jiaxianhao;

import lombok.Data;

//import javax.persistence.*;

@Data
//@Table(name = "card")
public class CardDto {
     /**
     * 主键
     */
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Integer id;
//    @Column(name = "name")
    private String name;

//    @Column(name = "age")
//    @Transient
    private Integer age;

    private Integer Number;

    private Integer Number1;
}
