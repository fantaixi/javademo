package 反射;

import java.util.Random;

/**
 * @author fantaixi
 * @create 2020-11-27 4:32
 */
//反射
public class ClassTest {
    public static void main(String[] args) throws Exception {
        ClassTest classTest = new ClassTest();
        Class a = classTest.getClass();
        System.out.println(a);

        String s = "java.util.Random";
        Class b = Class.forName(s);
        Object o = Class.forName(s).newInstance();
        System.out.println(b);
        System.out.println(o);

        System.out.println("---------------");
        System.out.println(classTest.getClass());

        Class c1 = Random.class;
        Class c2 = int.class;
        Class c3 = Double[].class;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

       
    }
}
