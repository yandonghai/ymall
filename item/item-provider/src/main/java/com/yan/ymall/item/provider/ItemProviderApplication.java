package com.yan.ymall.item.provider;

import com.yan.ymall.user.client.service.UserLoginService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yandonghai
 * @date 2019-03-01
 */
@SpringBootApplication(scanBasePackages = {"com.yan.ymall"})
@EnableFeignClients(basePackages = {"com.yan.ymall"})
@EnableDiscoveryClient
public class ItemProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemProviderApplication.class, args);
    }

}
