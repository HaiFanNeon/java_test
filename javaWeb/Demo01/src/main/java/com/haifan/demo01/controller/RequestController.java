package com.haifan.demo01.controller;

import com.haifan.demo01.haifan.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    // 1. 简单参数
    @RequestMapping("/simpleParam")
    public String simpleParam(String name, String age) {
        System.out.println(name);
        System.out.println(age);
        return "OK";
    }

    // 2. 实体参数
    @RequestMapping("/simpleHaiFan")
    public String simpleHaiFan(User user) {
        System.out.println(user);
        return user.toString();
    }
}
