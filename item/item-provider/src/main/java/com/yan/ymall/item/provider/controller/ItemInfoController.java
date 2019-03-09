package com.yan.ymall.item.provider.controller;

import com.yan.ymall.item.api.model.ItemInfo;
import com.yan.ymall.item.api.service.ItemInfoRemoteService;
import com.yan.ymall.user.api.model.User;
import com.yan.ymall.user.client.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemInfoController implements ItemInfoRemoteService {

    @Autowired
    private UserLoginService userLoginService;

    @ResponseBody
    public ItemInfo getItemInfo(ItemInfo itemInfo) {

        User user = new User();
        String result = userLoginService.loginIn(user);

        ItemInfo item = new ItemInfo();
        item.setCode("test");
        item.setName(result);
        return item;
    }
}
