package com.chd.dao;

import com.chd.pojo.User;

import java.util.List;

/**
 * @Author Big_Sea
 * @Date 2022/1/14 11:44
 * @Version 1.0
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //insert一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);

}
