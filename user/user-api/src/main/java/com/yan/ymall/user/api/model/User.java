package com.yan.ymall.user.api.model;

import java.io.Serializable;

/**
 * 用户信息实体
 * @author yandonghai
 * @date 2019-02-26
 */
public class User implements Serializable{

    private static final long serialVersionUID = 48127956287502081L;

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
