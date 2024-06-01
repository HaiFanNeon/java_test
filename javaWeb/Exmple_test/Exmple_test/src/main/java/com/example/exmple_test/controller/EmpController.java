package com.example.exmple_test.controller;


import com.example.exmple_test.pojo.Dept;
import com.example.exmple_test.pojo.Emp;
import com.example.exmple_test.pojo.PageBean;
import com.example.exmple_test.pojo.Result;
import com.example.exmple_test.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping (value = "/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, Short gender, @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
//        log.info("分页查询，参数：@{}， @{}",page, pageSize);
        PageBean pageBean = empService.page(page,pageSize, name, gender, begin, end);

        return Result.success(pageBean);
    }


    @DeleteMapping ("/{ids}")
    public Result deleteByIdEmp(@PathVariable List<Integer> ids) {
        empService.deleteByIdEmp(ids);
        return Result.success();
    }

    @PostMapping
    public Result addEmp(@RequestBody Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empService.addEmp(emp);
        return Result.success();
    }


}
