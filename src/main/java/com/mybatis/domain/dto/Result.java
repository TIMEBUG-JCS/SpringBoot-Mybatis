package com.mybatis.domain.dto;

import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Result {

    @Autowired
    private Rsp rsp;
    @Autowired
    private RspUserGetBulk rspUserGetBulk;

    public Rsp rtn(String code, String msg, String data) {
        rsp.setCode(code);
        rsp.setMsg(msg);
        rsp.setData(data);
        return rsp;
    }

    public RspUserGetBulk userGetBulkRtn(String code, String msg, List<User> data) {
        rspUserGetBulk.setCode(code);
        rspUserGetBulk.setMsg(msg);
        rspUserGetBulk.setData(data);
        return rspUserGetBulk;
    }
}
