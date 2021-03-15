import java.util.Arrays;

/**
 * @author fantaixi
 * @create 2020-12-01 23:29
 */
public class toStringTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,9};
        String s = a + "";
        System.out.println(s);
        String b = Arrays.toString(a);
        System.out.println(b);
        var sb = "sss";
        System.out.println(sb);
        Integer a1 = 128;
        Integer a2 = 128;
        System.out.println(a1==a2);

        var x= trip(-3.0,-10,-5);
        System.out.println(x);
    }
    public static  double trip(double... a){
        double largest = Double.NEGATIVE_INFINITY;
        for (double s:a) {
            if (s > largest){
                largest = s;
            }
        }
        return largest;
    }
}
