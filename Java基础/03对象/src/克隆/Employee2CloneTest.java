package 克隆;

/**
 * @author fantaixi
 * @create 2020-12-02 17:06
 */
public class Employee2CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee2 aaa = new Employee2("aaa", 5000);
        aaa.setHierday(2000,1,1);
        Employee2 copy = aaa.clone();
        copy.raiseSalary(10);
        copy.setHierday(1999,1,1);
        System.out.println(aaa);
        System.out.println(copy);
    }
}
