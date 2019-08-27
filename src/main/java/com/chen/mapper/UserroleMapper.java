package com.chen.mapper;

import com.chen.entity.Userrole;

    /**  
    * @title: UserroleMapper 
    * @description: TODO
    * @author Carl
    * @date 2019/8/27 15:45
    */
public interface UserroleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    Userrole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(Userrole record);

    int updateByPrimaryKey(Userrole record);
}