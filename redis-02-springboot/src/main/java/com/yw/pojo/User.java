package com.yw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author fantaixi
 * @create 2021-02-24 15:37
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
//所有的pojo需要序列化，
public class User implements Serializable {
    private String name;
    private int age;
}
