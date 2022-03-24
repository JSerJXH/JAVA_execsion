package com.ssm.dao;

import com.ssm.entity.User;

import java.util.List;

/**
 * @Author Big_Sea
 * @Date 2022/3/20 14:41
 * @Version 1.0
 */
public interface UserRepository {
    public List<User> findAll();
}
