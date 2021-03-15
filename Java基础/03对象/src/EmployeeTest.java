

/**
 * @author fantaixi
 * @create 2020-11-25 0:53
 */
public class EmployeeTest {
    public static void main(String[] args)  {
        //Employee[] employees = new Employee[3];
        //employees[0] = new Employee("a",10000,1991,8,15);
        //employees[1] = new Employee("b",10000,1992,8,15);
        //employees[2] = new Employee("c",10000,1993,8,15);
        ////给所有人工资提高百分之5
        //for (Employee s:employees) {
        //    s.raiseSalary(5);
        //}
        ////打印所有人
        //for (Employee s:employees) {
        //    System.out.println(s.toString());
        //}

        //FileOutputStream f = new FileOutputStream("file.txt");
        //System.setOut(new PrintStream(f));

        Employee a = new Employee("a",1,1991,1,1);
        Employee b = new Employee("b",2,1992,2,2);
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    //证明Java是按值调用
    public static void swap(Employee x,Employee y){
        Employee temp = x;
        x = y;
        y = temp;
    }
}
