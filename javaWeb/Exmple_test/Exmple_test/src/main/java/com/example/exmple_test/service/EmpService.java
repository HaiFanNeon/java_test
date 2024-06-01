package com.example.exmple_test.service;

import com.example.exmple_test.pojo.Emp;
import com.example.exmple_test.pojo.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {

    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    void deleteByIdEmp(List<Integer> ids);

    void addEmp(Emp emp);
}
