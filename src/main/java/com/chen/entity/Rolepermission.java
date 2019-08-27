package com.chen.entity;

import java.io.Serializable;
import lombok.Data;

    /**  
    * @title: Rolepermission 
    * @description: TODO
    * @author Carl
    * @date 2019/8/27 15:45
    */
@Data
public class Rolepermission implements Serializable {
    private Integer rpid;

    /**
    * 角色id
    */
    private Integer rid;

    /**
    * 权限id
    */
    private Integer pid;

    private static final long serialVersionUID = 1L;
}