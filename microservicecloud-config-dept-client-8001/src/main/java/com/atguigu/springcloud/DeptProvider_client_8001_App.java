package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author frnakman
 * @create 2020-06-15 10:15
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
//jar运行代码  java -jar microservicecloud.jar --spring.cloud.config.profile=dev
public class DeptProvider_client_8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_client_8001_App.class, args);
    }

}
