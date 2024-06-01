package com.example.exmple_test.mapper;


import com.example.exmple_test.pojo.Emp;
import com.example.exmple_test.pojo.PageBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    @Select("select count(*) from emp")
    public Long count();

//    @Select ("select * from emp limit #{page}, #{pageSize}")
    List<Emp> page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);


    void deleteByIdEmp(List<Integer> ids);


    @Insert ("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) values(#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    void addEmp(Emp emp);


//    @Select("select * from emp")
//    public List<Emp> list();
}
