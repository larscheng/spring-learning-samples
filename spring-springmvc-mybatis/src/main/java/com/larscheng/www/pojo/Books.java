package com.larscheng.www.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * books
 * @author 
 */
@Data
public class Books implements Serializable {
    /**
     * 书id
     */
    private Integer bookid;

    /**
     * 书名
     */
    private String bookname;

    /**
     * 数量
     */
    private Integer bookcounts;

    /**
     * 描述
     */
    private String detail;

    private static final long serialVersionUID = 1L;
}