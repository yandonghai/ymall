package com.yan.ymall.user.client.service;

import com.yan.ymall.user.api.model.User;
import com.yan.ymall.user.api.service.UserLoginRemoteService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value="USER-SERVICE",fallback = UserLoginService.HystrixClientFallback.class)
public interface UserLoginService extends UserLoginRemoteService {


    @Component
    public static class HystrixClientFallback implements UserLoginService {
        @Override
        public String loginIn(User user) {
            return "this fallback by hystrix";
        }
    }
}
