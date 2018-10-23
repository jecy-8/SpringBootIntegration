package com.example.springbootmybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

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


    @Resource
    private DruidProperties druidProperties;

    /**
     * 功能描述: 单数据源连接配置
     *
     * @param:[]
     * @return:com.alibaba.druid.pool.DruidDataSource
     * @date:2018/10/23 19:04
     **/
    @Bean
    public DruidDataSource singleDataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        druidProperties.config(dataSource);
        return dataSource;
    }
}
