package 克隆;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author fantaixi
 * @create 2020-12-02 16:55
 */
public class Employee2 implements Cloneable{
    private String name;
    private double salary;
    private Date hierday;

    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hierday = new Date();
    }

    @Override
    public String toString() {
        return "克隆.Employee2{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hierday=" + hierday +
                '}';
    }

    public void raiseSalary(double a){
        double raise = salary*a/100;
        salary += raise;
    }

    public Employee2 clone() throws CloneNotSupportedException{
        Employee2 cloned = (Employee2) super.clone();
        cloned.hierday = (Date) hierday.clone();
        return cloned;
    }
    public void setHierday(int year,int month,int day){
        Date time = new GregorianCalendar(year, month - 1, day).getTime();
        hierday.setTime(time.getTime());
    }
}
