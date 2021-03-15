package controller;

/**
 * @author fantaixi
 * @create 2021-01-08 10:16
 */
public class AAA {
    public static void main(String args[]) {
        int x, y;
        x = 5 >> 2;
        y = x >>> 2;
        System.out.println(y);
        System.out.println(17 ^ 5);

        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));
    }
}
