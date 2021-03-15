package com.Test;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author fantaixi
 * @create 2020-12-14 11:55
 */
public class AAA {
    @Test
    public void test(){
        List<String> strings = Arrays.asList("a", "b");
        System.out.println(strings);
        strings.add("aaa");
        System.out.println(strings);
    }
    @Test
    public void test1()  {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);
            byte[] buffer = new byte[10];
            int len;
            while ((len = fis.read(buffer)) != -1){
                String s = new String(buffer, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
