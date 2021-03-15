package 泛型;

/**
 * @author fantaixi
 * @create 2020-12-07 10:31
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] as= {"Marry","had","a","little"};
        Pair<String> s=Arraylg.minmax(as);
        System.out.println(s.getFirst());
        System.out.println(s.getSecond());
    }
}
class Arraylg{
    public static Pair<String> minmax(String[] a){
        if (a==null || a.length==0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1;i< a.length;i++){
            if (min.compareTo(a[i])>0) min = a[i];
            if (max.compareTo(a[i])<0) max = a[i];
        }
        return new Pair<>(min,max);
    }
}