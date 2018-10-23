package com.example.springbootmybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName:MybatisPlusConfig
 * @Description:TODO
 * @Author:lbt
 * @Date:2018/10/23 18:46
 * @Version:1.0
 */

@Configuration
@EnableTransactionManagement(order = 2)
@MapperScan(basePackages = {"com.example.springbootmybatis.dao"})
public class MybatisPlusConfig {


    @Autowired
    private DruidProperties druidProperties;

    @Bean
    public DruidDataSource singleDataSource() {

        DruidDataSource dataSource = new DruidDataSource();

    }
}
