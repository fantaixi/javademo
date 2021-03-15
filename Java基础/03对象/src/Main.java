import java.time.LocalDate;

/**
 * @author fantaixi
 * @create 2020-11-24 23:02
 */
public class Main {
    public static void main(String[] args) {
        //String s = new Date().toString();
        //System.out.println(s);

        //String s;
        //Date date = null;
        //s = date.toString();  //运行时错误

        //LocalDate now = LocalDate.now();
        //System.out.println(now);  //2020-11-24

        LocalDate of = LocalDate.of(1994, 8, 25);
        int year = of.getYear();
        int month = of.getMonthValue();
        int day = of.getDayOfMonth();
        System.out.println(year+" "+month+" "+day);

        //plusDays(参数)   会得到与设置的时间相差参数时间的日期
        LocalDate localDate = of.plusDays(1000);
        int year1 = localDate.getYear();
        int month1 = localDate.getMonthValue();
        int day1 = localDate.getDayOfMonth();
        System.out.println(year1+" "+month1+" "+day1);

        System.out.println(localDate.getDayOfWeek());
    }
}
