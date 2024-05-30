package com.haifan.demo2;

import com.haifan.HaiFan.User;
import com.haifan.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@MapperScan ("com.haifan.mapper")
@SpringBootTest
class Demo2ApplicationTests {

    @Autowired (required = false)
    private UserMapper userMapper;

    @Test
    public void testListUser() {
        List<User> userList = userMapper.list();

        userList.stream().forEach(user->{
            System.out.println(user);
        });

    }

}
