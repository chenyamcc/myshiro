package com.chen.mapper;

import com.chen.entity.Permission;

    /**  
    * @title: PermissionMapper 
    * @description: TODO
    * @author Carl
    * @date 2019/8/27 15:45
    */
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}