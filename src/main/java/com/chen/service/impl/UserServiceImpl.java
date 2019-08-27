package com.chen.service.impl;

import com.chen.entity.User;
import com.chen.mapper.UserMapper;
import com.chen.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Carl
 * @title: UserServiceImpl
 * @description: 实现类
 * @date 2019/8/26 19:26
 */
@Service
public class UserServiceImpl implements UserService  {
    @Resource
    private UserMapper userMapper;
    @Override
    public User selectByUsername(String username)  throws Exception{
       User user =  userMapper.selectByUsername(username);
       return user;
    }
}
