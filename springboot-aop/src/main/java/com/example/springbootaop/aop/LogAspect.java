package com.example.springbootaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @ClassName:LogAspect
 * @Description:TODO 用户登录切面
 * @Author:lbt
 * @Date:2018/10/16 11:46
 * @Version:1.0
 */

@Aspect
@Component
public class LogAspect {

    /**
     * 功能描述: 拦截对这个包下所有方法的访问
     * @param:[]
     * @return:void
     **/
    @Pointcut("execution(* com.example.springbootaop.controller.*.*(..))")
    public void loginLog(){}

    /**
     * 功能描述: 我们在访问之前要做的事情
     * @param:[]
     * @return:void
     **/
    @Before("loginLog()")
    public void loginBefore(JoinPoint joinPoint) {

        // 我们从请求的上下文中获取request，记录请求的内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = attributes.getRequest();

        System.out.println("请求路径 : " + request.getRequestURL());
        System.out.println("请求方式 : " + request.getMethod());
        System.out.println("IP地址 : " + request.getRemoteAddr());
        System.out.println("方法名 : " + joinPoint.getSignature().getName());
        System.out.println("类路径 : " + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("参数 : " + Arrays.toString(joinPoint.getArgs()));
    }
}
