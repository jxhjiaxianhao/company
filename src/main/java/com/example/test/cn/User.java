package com.example.test.cn;

import com.example.test.cn.jiaxianhao.CardDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface User  {
    @Select("SELECT *  FROM user where id =#{id}")
    List<Map<String,String>> getUser(Integer id);

    @Select("SELECT *  FROM user where createtime =#{id}")
    List<Map<String,String>> getUser1(Date id);

    @Select("select * from card where id =#{id}")
    List<Map> se(@Param("id") int id);




}
