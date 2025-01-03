package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoMapper {
    @Insert("insert into user_info(`user_name`,`password`)values(#{name},#{password})")
    Integer insert(@Param("name") String name,@Param("password") String password);
}