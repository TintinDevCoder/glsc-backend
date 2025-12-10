package com.dd.glsc.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@MapperScan("com.dd.glsc.member.dao")
@EnableFeignClients(basePackages = "com.dd.glsc.member.feign")
@SpringBootApplication
public class GlscMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlscMemberApplication.class, args);
    }

}
