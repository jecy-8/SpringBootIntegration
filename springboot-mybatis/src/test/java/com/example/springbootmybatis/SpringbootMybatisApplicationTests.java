package com.example.springbootmybatis;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void contextLoads() {

        User user = userService.selectUserById(1);

        System.out.println(user);
    }
}
