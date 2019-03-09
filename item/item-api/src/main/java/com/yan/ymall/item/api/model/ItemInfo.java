package com.yan.ymall.item.api.model;

import java.io.Serializable;

/**
 * 商品实体
 * @author yandonghai
 * @date 2019-03-01
 */
public class ItemInfo implements Serializable {

    private static final long serialVersionUID = -7819850590213865428L;

    private Long id;
    private String code;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
