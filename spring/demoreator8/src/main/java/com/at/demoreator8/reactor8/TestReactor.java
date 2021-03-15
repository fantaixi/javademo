package com.at.demoreator8.reactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author fantaixi
 * @create 2021-01-04 4:44
 */
public class TestReactor {
    public static void main(String[] args) {
        //just方法直接声明元素
        Flux.just(1,2,3,4).subscribe(System.out::print);
        System.out.println();
        Mono.just(1).subscribe(System.out::print);

        //其他方法
        Integer[] arr={1,2,3,4};
        Flux.fromArray(arr).subscribe(System.out::print);
        //
        //List<Integer> list = Arrays.asList(arr);
        //Flux.fromIterable(list);
        //
        //Stream<Integer> stream = list.stream();
        //Flux.fromStream(stream);
    }
}
