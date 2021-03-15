package controller;

/**
 * @author fantaixi
 * @create 2021-01-08 9:59
 */
public class A {


    public static void main(String[] args) {
        int i = 3;
        String result = new String();
        switch (i) {
            case 1:
                result = result + "him ";
            case 2:
                result = result + "her ";
            case 3:
                result = result + "it ";
            default:
                result = result + "me ";
        }
        System.out.println(result);
    }
}
