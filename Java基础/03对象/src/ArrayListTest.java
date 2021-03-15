import java.util.ArrayList;

/**
 * @author fantaixi
 * @create 2020-11-26 18:30
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        //al.add(new Employee("a",1,1991,2,8));
        //System.out.println(al.toString());
        double m = max(3.1,9.9,1234567891);
        System.out.println(m);
    }
    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for (double v:values){
            if (v > largest)
                largest=v;
        }
        return largest;
    }
}
