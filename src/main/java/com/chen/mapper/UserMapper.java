package com.chen.mapper;

import com.chen.entity.User;

/**
 * @author Carl
 * @title: UserMapper
 * @description: TODO
 * @date 2019/8/27 15:45
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUsername(String username);
}