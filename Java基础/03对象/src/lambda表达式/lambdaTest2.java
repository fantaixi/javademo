package lambda表达式;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author fantaixi
 * @create 2020-12-03 9:15
 */
public class lambdaTest2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        //map.forEach(new BiConsumer<Integer, String>() {
        //    @Override
        //    public void accept(Integer integer, String s) {
        //        System.out.println(integer+"="+s);
        //    }
        //});
        map.forEach((i,s) -> System.out.println(i+"="+s));

        // 使用Collectors.joining()拼接字符串
        Stream<String> stream = Stream.of("I", "love", "you");
        //String joined = stream.collect(Collectors.joining());// "Iloveyou"
        //String joined = stream.collect(Collectors.joining(","));// "I,love,you"
        String joined = stream.collect(Collectors.joining(",", "{", "}"));// "{I,love,you}"
        System.out.println(joined);
    }
}
