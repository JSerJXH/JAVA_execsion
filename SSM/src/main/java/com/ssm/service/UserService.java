package com.ssm.service;

import com.ssm.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Big_Sea
 * @Date 2022/3/20 14:43
 * @Version 1.0
 */

public interface UserService {
    public List<User> findAll();
}
