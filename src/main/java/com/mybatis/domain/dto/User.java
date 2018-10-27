package com.mybatis.domain.dto;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class User implements Serializable {
    private static final long serialVersionUID = -395549621428578994L;
    private String name;

    private Integer id;

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
}
