package com.yan.ymall.user.provider.controller;

import com.yan.ymall.user.api.model.User;
import com.yan.ymall.user.api.service.UserLoginRemoteService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController implements UserLoginRemoteService {

    @ResponseBody
    @Override
    public String loginIn(@RequestBody User user) {
        /*try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "success";
    }
}
