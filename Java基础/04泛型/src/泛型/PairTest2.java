package 泛型;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fantaixi
 * @create 2020-12-07 10:55
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] arr = {
                LocalDate.of(1906,1,1),
                LocalDate.of(1999,10,1),
                LocalDate.of(2010,10,1),
                LocalDate.of(2000,9,4)
        };
        Pair<LocalDate> aa = Arraylg1.minmax(arr);
        System.out.println(aa.getFirst());
        System.out.println(aa.getSecond());

        List<String> l1 = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<Integer>();
        System.out.println(l1.getClass() == l2.getClass());
    }
}
class Arraylg1{
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if (a==null || a.length==0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1;i< a.length;i++){
            if (min.compareTo(a[i])>0) min = a[i];
            if (max.compareTo(a[i])<0) max = a[i];
        }
        return new Pair<>(min,max);
    }
}