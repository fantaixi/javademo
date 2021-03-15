package com.at.spring5;

/**
 * @author fantaixi
 * @create 2020-12-29 2:14
 */
public class Book {
    private String name;
    private String author;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
