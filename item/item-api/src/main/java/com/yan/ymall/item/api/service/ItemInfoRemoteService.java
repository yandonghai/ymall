package com.yan.ymall.item.api.service;

import com.yan.ymall.item.api.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ItemInfoRemoteService {

    @RequestMapping(value = "/item/info/get",method = RequestMethod.POST)
    public ItemInfo getItemInfo(@RequestBody ItemInfo itemInfo);
}
