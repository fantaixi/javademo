package com.at.spring5.factoryBean;

import com.at.spring5.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author fantaixi
 * @create 2020-12-29 10:30
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("aaa");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
