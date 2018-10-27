package com.mybatis.domain.dto;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * \* Author: jcs
 * \* Date: 2018/10/25
 * \* Time: 14:35
 * \* Description:
 * \
 */
@Repository
public class RspUserGetBulk implements Serializable {

    private static final long serialVersionUID = 8456479559917792245L;

    private String code;

    private String msg;

    private List<User> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}