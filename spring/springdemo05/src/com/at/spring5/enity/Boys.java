package com.at.spring5.enity;

/**
 * @author fantaixi
 * @create 2021-01-03 1:56
 */
public class Boys {
    private int id;
    private String boyName;
    private int userCP;

    @Override
    public String toString() {
        return "Boys{" +
                "id=" + id +
                ", boyName='" + boyName + '\'' +
                ", userCP=" + userCP +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public int getUserCP() {
        return userCP;
    }

    public void setUserCP(int userCP) {
        this.userCP = userCP;
    }
}
