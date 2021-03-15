package 泛型;

/**
 * @author fantaixi
 * @create 2020-12-07 15:37
 */
public class TaskTest {
    public static void main(String[] args) {
        var thread = new Thread(Task.asRunnable(() ->
                {
                    Thread.sleep(1000);
                    System.out.println("hello");
                    throw new Exception("checked");
                }
        ));
        thread.start();
    }
}
