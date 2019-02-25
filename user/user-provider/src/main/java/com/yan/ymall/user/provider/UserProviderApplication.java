package com.yan.ymall.user.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author yandonghai
 * @date 2019-02-25
 */
@SpringBootApplication(scanBasePackages = {"com.yan.ymall.user"})
@EnableHystrix
@EnableDiscoveryClient
public class UserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class, args);
    }

}
