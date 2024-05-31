package com.example.exmple_test.service.impl;

import com.example.exmple_test.mapper.DeptMapper;
import com.example.exmple_test.pojo.Dept;
import com.example.exmple_test.pojo.Result;
import com.example.exmple_test.service.DeptService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptMapper deptMapper;


    @Override
    public List<Dept> listAllDept() {
        return deptMapper.listAllDept();
    }

    @Override
    public void deleteDept(Integer id) {
        deptMapper.deleteDept(id);
    }

    @Override
    public void addDept(String name) {
        deptMapper.addDept(name, LocalDate.now(), LocalDate.now());
    }
}
