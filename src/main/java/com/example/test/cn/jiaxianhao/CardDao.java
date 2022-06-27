package com.example.test.cn.jiaxianhao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface CardDao {
    @Select("SELECT * FROM Card where id =#{id}")
    Card selectCard(@Param("id")String id);


    @Select("SELECT * FROM Card where id =#{id}")
    Map selectCard1(@Param("id")String id);

}
