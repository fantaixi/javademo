package lambda表达式;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * @author fantaixi
 * @create 2020-12-03 7:29
 */
public class lambdaTest {
    public static void main(String[] args) {
        var a = new String[]{"Mercury","Venus","Earth","Mars"};
        System.out.println(Arrays.toString(a));
        System.out.println("排序之后：");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("根据长度排序：");
        Arrays.sort(a,(first,second) -> first.length() - second.length());
        System.out.println(Arrays.toString(a));

        var timer = new Timer(1000, event ->
                System.out.println("The time is“"+new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit?");
        System.exit(0);
    }
}
