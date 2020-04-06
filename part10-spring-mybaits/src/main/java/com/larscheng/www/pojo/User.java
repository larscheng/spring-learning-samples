package com.larscheng.www.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}