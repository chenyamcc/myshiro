package com.chen.mapper;

import com.chen.entity.Rolepermission;

    /**  
    * @title: RolepermissionMapper 
    * @description: TODO
    * @author Carl
    * @date 2019/8/27 15:45
    */
public interface RolepermissionMapper {
    int deleteByPrimaryKey(Integer rpid);

    int insert(Rolepermission record);

    int insertSelective(Rolepermission record);

    Rolepermission selectByPrimaryKey(Integer rpid);

    int updateByPrimaryKeySelective(Rolepermission record);

    int updateByPrimaryKey(Rolepermission record);
}