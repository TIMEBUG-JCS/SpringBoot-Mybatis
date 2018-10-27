package com.mybatis.service;

import com.mybatis.domain.dto.Result;
import com.mybatis.domain.dto.Rsp;
import com.mybatis.domain.dto.RspUserGetBulk;
import com.mybatis.domain.dto.User;
import com.mybatis.domain.entity.UserInfo;
import com.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


@Component
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Result result;

    public Rsp create(String name) {
        Integer id = userMapper.getMaxId();
//        UserInfo userInfo = new UserInfo(name, id+1);
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id+1);
        userInfo.setName(name);
        userMapper.insert(userInfo);
        return result.rtn("0","操作成功","");
    }

    public Rsp delete(Integer id) {
        userMapper.delete(id);
        return result.rtn("0","操作成功","");
    }

    public Rsp update(Integer id, String name) {
//        UserInfo userInfo = new UserInfo(name,id);
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setName(name);
        userMapper.update(userInfo);
        return result.rtn("0","操作成功","");
    }

    public RspUserGetBulk getBulk() {
        List<User> msg = new ArrayList<>();
        List<UserInfo> users = userMapper.getAll();
        for (int i = 0; i < users.size(); i++) {
            User user = new User();
            Integer userId = users.get(i).getId();
            user.setId(userId);
            String userName = users.get(i).getName();
            user.setName(userName);
            msg.add(user);
        }
        return result.userGetBulkRtn("","操作成功",msg);
    }

}
