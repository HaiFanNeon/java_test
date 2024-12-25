package com.example.demo.controller;


import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Transactional
    @RequestMapping("/registry")
    public String registry(String name,String password){
        userService.registryUser(name,password);
        int a = 10 / 0;
        return "注册成功";
    }

    @Transactional(rollbackFor = Exception.class)
    @RequestMapping("/r2")
    public String r2(String name,String password) throws IOException {
        //用户注册
        userService.registryUser(name,password);
        log.info("用户数据插入成功");
        if (true){
            throw new IOException();
        }
        return "r2";
    }
}