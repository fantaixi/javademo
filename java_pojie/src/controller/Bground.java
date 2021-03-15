package controller;

/**
 * @author fantaixi
 * @create 2021-01-08 9:55
 */
public class Bground extends Thread {
    public static void main(String argv[]) {
        Bground b = new Bground();
        b.run();
    }

    @Override
    public void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i = " + i);
        }
    }
}