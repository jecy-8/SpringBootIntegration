package com.example.springbootaop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName ; Auth
 * @Description TODO : 校验登录的注解
 * @Author : liangbintao
 * @Date : 20:59 2018/10/16
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Auth {

    String desc() default "验证是否登录";
}
