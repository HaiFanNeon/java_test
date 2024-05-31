package com.example.exmple_test.controller;


import com.example.exmple_test.pojo.Dept;
import com.example.exmple_test.pojo.Result;
import com.example.exmple_test.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {
    
    @Autowired
    private DeptService deptService;

//    @RequestMapping(value = "/depts", method = RequestMethod.GET)
    @GetMapping
    public Result listDeptAll() {
        log.info("查询全部部门数据");
        List<Dept> deptsList = deptService.listAllDept();
        return Result.success(deptsList);
    }

//    @RequestMapping (value = "/depts/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public Result DeleteDept(@PathVariable Integer id) {
        log.info("删除的id@ " + id);
        deptService.deleteDept(id);

        return Result.success();
    }

//    @RequestMapping (value = "/depts", method = RequestMethod.POST)
    @PostMapping
    public Result AddDept(@RequestBody Dept dept) {
        log.info("新增的部门@{}", dept);
        deptService.addDept(dept.getName());
        return Result.success();
    }

}
