import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @author fantaixi
 * @create 2020-12-08 17:36
 */
public class 优先队列 {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1902,1,1));
        pq.add(LocalDate.of(1899,2,2));
        pq.add(LocalDate.of(2020,10,10));
        for (LocalDate date : pq ) {
            System.out.println(date);
            while (!pq.isEmpty()){
                System.out.println(pq.remove());
            }
        }
    }
}
