package 克隆;

import java.util.Arrays;

/**
 * @author fantaixi
 * @create 2020-12-02 16:48
 */
public class CloneTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = a.clone();
        b[0] = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
