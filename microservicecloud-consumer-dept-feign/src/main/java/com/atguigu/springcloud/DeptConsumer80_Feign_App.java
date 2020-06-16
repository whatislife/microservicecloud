package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author frnakman
 * @create 2020-06-16 13:32
 */
@SpringBootApplication
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
//@EnableFeignClients(basePackageClasses= {com.atguigu.springcloud.service.DeptClientService.class})
@ComponentScan("com.atguigu.springcloud")
public class DeptConsumer80_Feign_App {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer80_Feign_App.class,args);

    }
}
