import java.util.Arrays;

/**
 * @author fantaixi
 * @create 2020-12-02 6:05
 */
public class Employee1Test {
    public static void main(String[] args) {
        var a = new Employee1[3];
        a[0] = new Employee1("a",1.0);
        a[1] = new Employee1("b",3.0);
        a[2] = new Employee1("c",2.0);
        Arrays.sort(a);
        for (Employee1 s:a) {
            System.out.println(s.toString());
        }
    }
}
