package com.example.springbootaop.aop;

import com.example.springbootaop.annotation.Auth;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName ; LoginAspect
 * @Description TODO :
 * @Author : liangbintao
 * @Date : 21:03 2018/10/16
 */

@Aspect
@Component
public class LoginAspect {

    @Pointcut(value = "@annotation(com.example.springbootaop.annotation.Auth)")
    public void access() {
    }

    @Before("access()")
    public void before() {

        System.out.println("开始验证用户是否登录...");
    }

    @Around("@annotation(auth)")
    public Object around(ProceedingJoinPoint pj, Auth auth) {

        // 获取注解中的值
        System.out.println("注解中的值 : " + auth.desc());
        try {

            // 检验是否登录 true 已经登录  false 未登录
            Boolean flag = true;

            if (flag == true) {
                return "已登录";
            } else {
                return "未登录";
            }
        } catch (Throwable throwable) {
            return null;
        }
    }
}
