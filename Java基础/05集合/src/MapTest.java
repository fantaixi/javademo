import java.util.HashMap;

/**
 * @author fantaixi
 * @create 2020-12-08 17:47
 */
public class MapTest {
    public static void main(String[] args) {
        var a = new HashMap<>();
        a.put("1",new Employee("a"));
        a.put("2",new Employee("b"));
        a.put("3",new Employee("c"));
        a.put("4",new Employee("d"));

        System.out.println(a);

        a.remove("4");
        a.put("3",new Employee("c1"));
        System.out.println(a.get("1"));
        System.out.println("--------");
        a.forEach((k,v) ->
                System.out.println("key="+k+",value="+v)
        );
    }
}
