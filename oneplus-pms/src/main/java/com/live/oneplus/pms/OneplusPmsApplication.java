package com.live.oneplus.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OneplusPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneplusPmsApplication.class, args);
    }

}
