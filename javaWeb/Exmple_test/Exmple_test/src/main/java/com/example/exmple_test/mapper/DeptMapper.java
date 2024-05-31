package com.example.exmple_test.mapper;


import com.example.exmple_test.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface DeptMapper {

    /*
    *  查询全部门
    *  @return
    * */
    @Select("select * from dept")
    List<Dept> listAllDept();


    @Delete("delete from dept where id = #{id}")
    void deleteDept(Integer id);


    @Insert("insert into dept(name, create_time, update_time) values(#{name}, #{now}, #{nowed})")
    void addDept(String name, LocalDate now, LocalDate nowed);
}
