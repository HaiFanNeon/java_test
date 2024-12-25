package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogInfoMapper {
    @Insert("insert into log_info(`user_name`,`op`)values(#{name},#{op})")
    Integer insertLog(@Param("name") String name,@Param("op") String op);
}