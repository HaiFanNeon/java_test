package com.example.exmple_test.service.impl;

import com.example.exmple_test.mapper.EmpMapper;
import com.example.exmple_test.pojo.Emp;
import com.example.exmple_test.pojo.PageBean;
import com.example.exmple_test.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
        Long count = empMapper.count();

        Integer start = (page - 1) * pageSize;
        List<Emp> empList = empMapper.page(start, pageSize, name, gender, begin, end);

        PageBean pageBean = new PageBean(count, empList);
        return pageBean;
    }

    @Override
    public void deleteByIdEmp(List<Integer> ids) {
        empMapper.deleteByIdEmp(ids);
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.addEmp(emp);
    }

//    @Override
//    public PageBean page(Integer page, Integer pageSize) {
//        PageHelper.startPage(page, pageSize);
//        List<Emp> empList = empMapper.list();
//        Page<Emp> p = (Page<Emp>)empList;
//        return new PageBean(p.getTotal(), p.getResult());
//    }
}
