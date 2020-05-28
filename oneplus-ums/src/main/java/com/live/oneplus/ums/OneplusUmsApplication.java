package com.live.oneplus.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@EnableFeignClients
@MapperScan("com.live.oneplus.ums.dao")
public class OneplusUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneplusUmsApplication.class, args);
    }

}
