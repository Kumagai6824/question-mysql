package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HelloMapper {
    @Select("SELECT * FROM hellos")
    List<HelloEntity> findAll();
}

//後でxmlにしたい。
