package com.yan.ymall.user.api.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yan.ymall.user.api.model.User;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yandonghai
 * @date 2019-02-26
 */
public interface UserLoginRemoteService {

    @RequestMapping(value = "/user/loginIn",method = RequestMethod.POST)
    public String loginIn(@RequestBody User user);
}
