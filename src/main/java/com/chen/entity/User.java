package com.chen.entity;

import java.io.Serializable;
import lombok.Data;

    /**  
    * @title: User 
    * @description: TODO
    * @author Carl
    * @date 2019/8/27 15:45
    */
@Data
public class User implements Serializable {
    /**
    * 主键
    */
    private Integer uid;

    /**
    * 账号
    */
    private String usercode;

    /**
    * 姓名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 盐
    */
    private String salt;

    /**
    * 账号是否锁定，1：锁定，0未锁定
    */
    private String locked;

    private static final long serialVersionUID = 1L;
}