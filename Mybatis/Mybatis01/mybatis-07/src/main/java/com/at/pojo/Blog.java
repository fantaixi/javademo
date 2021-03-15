package com.at.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author fantaixi
 * @create 2021-01-07 8:57
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private String views;
}
