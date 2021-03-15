package com.gg;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author fantaixi
 * @create 2020-12-27 2:26
 */
public class Main {
    @Test
    public void test1(){
        Arrays.asList("a1","a2","a3").stream().findFirst().ifPresent(System.out::println);
        Stream.of("a1","a2","a3").findFirst().ifPresent(System.out::println);
    }
}
