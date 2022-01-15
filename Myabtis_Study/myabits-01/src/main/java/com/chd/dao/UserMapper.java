package com.chd.dao;

import com.chd.pojo.User;

import java.util.List;

/**
 * @Author Big_Sea
 * @Date 2022/1/13 16:39
 * @Version 1.0
 */
public interface UserMapper {
    List<User> getUserList();
    //增加一个用户

    List<User> getUserLike(String value);
}
