package com.chen.entity;

import java.io.Serializable;
import lombok.Data;

    /**  
    * @title: Role 
    * @description: TODO
    * @author Carl
    * @date 2019/8/27 15:45
    */
@Data
public class Role implements Serializable {
    private Integer rid;

    private String rname;

    /**
    * 是否可用,1：可用，0不可用
    */
    private String available;

    private static final long serialVersionUID = 1L;
}