package com.cxz.storeuserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.cxz.storeuserservice.mapper")
@SpringBootApplication
public class StoreUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreUserServiceApplication.class, args);
    }

}
