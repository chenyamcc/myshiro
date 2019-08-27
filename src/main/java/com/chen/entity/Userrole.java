package com.chen.entity;

import java.io.Serializable;
import lombok.Data;

    /**  
    * @title: Userrole 
    * @description: TODO
    * @author Carl
    * @date 2019/8/27 15:45
    */
@Data
public class Userrole implements Serializable {
    private Integer urid;

    private Integer uid;

    private Integer rid;

    private static final long serialVersionUID = 1L;
}