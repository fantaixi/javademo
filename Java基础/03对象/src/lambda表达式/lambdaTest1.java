package lambda表达式;

/**
 * @author fantaixi
 * @create 2020-12-03 8:56
 */
public class lambdaTest1 {
    Runnable r1 = () -> {
        System.out.println(this);
    };
    Runnable r2  =() -> {
        System.out.println(toString());
    };
    public static void main(String[] args) {
        //new Thread(
        //        () -> System.out.println("aaa")
        //).start();
        new lambdaTest1().r1.run();
        new lambdaTest1().r2.run();
    }
    public String toString(){return "Hello";}
}
