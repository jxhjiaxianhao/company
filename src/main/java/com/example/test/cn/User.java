package com.example.test.cn;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
import java.util.Map;

@Mapper
public interface User {
    @Select("SELECT name  FROM user where id =#{id}")
    List<Map<String,String>> getUser(Integer id);



}
