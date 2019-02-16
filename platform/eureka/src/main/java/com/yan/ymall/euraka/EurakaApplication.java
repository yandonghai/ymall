package com.yan.ymall.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yandh
 * @date 2019-02-15 14:30:00
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakaApplication.class, args);
    }

}

