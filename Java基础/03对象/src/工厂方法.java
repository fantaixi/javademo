import java.text.NumberFormat;

/**
 * @author fantaixi
 * @create 2020-11-25 3:28
 */
public class 工厂方法 {
    public static void main(String[] args) {
        NumberFormat n1 = NumberFormat.getCurrencyInstance();
        NumberFormat n2 = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(n1.format(x));
        System.out.println(n2.format(x));
    }
}
