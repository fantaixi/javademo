package com.at.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fantaixi
 * @create 2021-01-05 1:03
 */
@Data
@AllArgsConstructor //有全部参数构造
@NoArgsConstructor //无参数构造
public class User {
    private int id;
    private String name;
    private String password;
}
