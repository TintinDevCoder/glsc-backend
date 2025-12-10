package com.dd.glsc.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.dd.glsc.order.dao")
@SpringBootApplication
public class GlscOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlscOrderApplication.class, args);
    }

}
