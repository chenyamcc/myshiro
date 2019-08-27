package com.chen.mapper;

import com.chen.entity.Role;

    /**  
    * @title: RoleMapper 
    * @description: TODO
    * @author Carl
    * @date 2019/8/27 15:45
    */
public interface RoleMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}