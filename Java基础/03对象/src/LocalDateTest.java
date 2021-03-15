import java.time.LocalDate;
import java.util.Date;

/**
 * @author fantaixi
 * @create 2020-12-01 4:23
 */
public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        Date date = new Date();
        System.out.println(date.getDay());
        System.out.println();
        LocalDate now = LocalDate.now();
        LocalDate newNow = now.plusDays(1000);  //在原来的基础上增加n天，不改变原来的对象
        System.out.println(now);
        System.out.println(newNow);
    }
}
