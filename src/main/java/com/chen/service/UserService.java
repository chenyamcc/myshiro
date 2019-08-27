package com.chen.service;

import com.chen.entity.User;

/**
 * @author Carl
 * @title: UserService
 * @description: inter service
 * @date 2019/8/26 19:26
 */
public interface UserService {
    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 用户数据
     * @throws Exception 数据层异常
     */
    User selectByUsername(String username) throws Exception;
}
