package com.at.utils;

import java.util.UUID;

/**
 * @author fantaixi
 * @create 2021-01-07 9:12
 */
public class IDUtils {
    //çæéæºID
    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
