package com.kuang.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author fantaixi
 * @create 2021-01-15 15:49
 */
@Component  //添加到组件中
@ConfigurationProperties(prefix = "dog")
public class Dog {
    private String lastName;  //yaml中  last-name  这就是松散绑定
    private Integer age;

    public Dog() {
    }

    public Dog(String lastName, Integer age) {
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
