package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author fantaixi
 * @create 2021-01-08 9:53
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("a");
        Set set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("a");
        System.out.println(list.size() + "," + set.size());
    }
}