package com.at.spring5.bean;

/**
 * @author fantaixi
 * @create 2020-12-29 11:32
 */
public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步  调用无参构造......");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调用set设置属性值....");
    }

    public void initMethod(){
        System.out.println("第三步 执行初始化的方法.....");
    }

    public void destroyMethod(){
        System.out.println("第五步 执行销毁的方法.....");
    }
    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                '}';
    }
}
