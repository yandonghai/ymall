package com.yan.ymall.item.client.service;

import com.yan.ymall.item.api.model.ItemInfo;
import com.yan.ymall.item.api.service.ItemInfoRemoteService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author yandonghai
 * @date 2019-03-01
 * 商品声明式客户端,微服务间调用
 */
@Component
@FeignClient(value = "item-service",fallback = ItemInfoService.HystrixClientFallback.class)
public interface ItemInfoService extends ItemInfoRemoteService {

    @Component
    public static class HystrixClientFallback implements ItemInfoService{
        public ItemInfo getItemInfo(ItemInfo itemInfo) {
            return null;
        }
    }
}
