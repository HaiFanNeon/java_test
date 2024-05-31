package com.example.exmple_test.service;

import com.example.exmple_test.pojo.Dept;

import java.util.List;

public interface DeptService {
    /*
    * 查询部门表数据
    * */
    public List<Dept> listAllDept();

    public void deleteDept(Integer id);

    void addDept(String name);
}
