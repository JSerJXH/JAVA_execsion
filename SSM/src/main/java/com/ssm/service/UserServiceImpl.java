package com.ssm.service;

import com.ssm.dao.UserRepository;
import com.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Big_Sea
 * @Date 2022/3/20 14:44
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService{
   @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
