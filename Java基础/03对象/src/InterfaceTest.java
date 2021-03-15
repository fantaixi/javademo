import java.math.BigDecimal;

/**
 * @author fantaixi
 * @create 2020-12-02 5:41
 */
public class InterfaceTest {
    public static void main(String[] args) {
        var a = new BigDecimal(1.0);
        var b = new BigDecimal(1.00);
        System.out.println(a.compareTo(b));
        //Arrays.sort();
    }
}
