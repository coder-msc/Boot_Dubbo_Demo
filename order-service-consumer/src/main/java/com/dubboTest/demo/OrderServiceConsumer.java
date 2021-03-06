package com.dubboTest.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by IntelliJ IDEA.
 *
 * @Auther: jkMa
 * @Date: 2020/3/31 21:07
 * @ItemName: dubboDemo
 */

@EnableDubbo
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class OrderServiceConsumer {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceConsumer.class,args);
    }
}
