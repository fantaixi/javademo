package com.kuang.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author fantaixi
 * @create 2021-01-20 21:59
 */
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty("用户名")
    public String username;
    public String password;
}
