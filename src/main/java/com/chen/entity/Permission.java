package com.chen.entity;

import java.io.Serializable;
import lombok.Data;

    /**  
    * @title: Permission 
    * @description: TODO
    * @author Carl
    * @date 2019/8/27 15:45
    */
@Data
public class Permission implements Serializable {
    /**
    * 主键
    */
    private Integer pid;

    /**
    * 资源名称
    */
    private String pname;

    /**
    * 资源类型：menu,button,
    */
    private String type;

    /**
    * 访问url地址
    */
    private String url;

    /**
    * 权限代码字符串
    */
    private String percode;

    /**
    * 父结点id
    */
    private Integer parentpid;

    /**
    * 父结点id列表串
    */
    private String parentpids;

    /**
    * 排序号
    */
    private String sortstring;

    /**
    * 是否可用,1：可用，0不可用
    */
    private String available;

    private static final long serialVersionUID = 1L;
}