package com.mybatis.domain.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {


    private String name;
    private Integer id;

//    public UserInfo() {
//    }
//
//    public UserInfo(String name, Integer id) {
//        this.name = name;
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "userId" + this.id + ", Username " + this.name;
    }
}
