import java.math.BigInteger;

/**
 * @author fantaixi
 * @create 2020-11-23 17:52
 */
public class 大数值 {
    public static void main(String[] args) {
        BigInteger b1,b2;
        b1 = new BigInteger("1234567894133213131321326489");
        b2 = new BigInteger("56465465312848646544685465465");
        //不能直接用+ * 得用方法
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2)); //  乘法
    }
}
