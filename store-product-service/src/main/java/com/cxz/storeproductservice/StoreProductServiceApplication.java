package com.cxz.storeproductservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.cxz.storeproductservice.mapper")
@SpringBootApplication
public class StoreProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreProductServiceApplication.class, args);
    }

}
