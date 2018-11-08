package com.mybatis.controller;

import com.mybatis.domain.dto.Rsp;
import com.mybatis.domain.dto.RspUserGetBulk;
import com.mybatis.domain.dto.User;
import com.mybatis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public Rsp create(@RequestBody User user) {
        String name = user.getName();
        return userService.create(name);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    @ResponseBody
    public Rsp delete(@RequestBody User user) {
        Integer id = user.getId();
        return userService.delete(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ResponseBody
    public Rsp update(@RequestBody User user) {
        Integer id = user.getId();
        String name = user.getName();
        return userService.update(id,name);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public RspUserGetBulk getBulk() {
        return userService.getBulk();
    }
}
