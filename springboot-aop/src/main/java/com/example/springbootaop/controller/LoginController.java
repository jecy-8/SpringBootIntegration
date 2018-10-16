package com.example.springbootaop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:LoginController
 * @Description:TODO
 * @Author:lbt
 * @Date:2018/10/16 11:43
 * @Version:1.0
 */

@RestController
public class LoginController {

    @GetMapping(value = "/username")
    public String getLoginUserName(String userName, Integer age) {

        return userName + " --- " + age;
    }
}
