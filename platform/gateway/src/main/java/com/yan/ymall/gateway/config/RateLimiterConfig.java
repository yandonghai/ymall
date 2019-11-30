package com.yan.ymall.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * 路由限流配置
 *
 * @author yandonghai
 * @date 2019-03-21
 */
@Configuration
public class RateLimiterConfig {

    @Bean(value = "remoteAddressKeyResolver")
    public KeyResolver remoteAddressKeyResolver() {
        return exchange -> Mono.just(Optional.ofNullable(exchange.getRequest()).map(request -> request.getRemoteAddress()).map(address -> address.getAddress()).map(hostAddress -> hostAddress.getHostAddress()).orElse(""));
    }
}
