package com.mybatis.mapper;

import com.mybatis.domain.entity.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    List<UserInfo> getAll();

    void insert(UserInfo user);

    void update(UserInfo user);

    void delete(Integer id);

    Integer getMaxId();
}
