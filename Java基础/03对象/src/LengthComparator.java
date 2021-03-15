import java.util.Arrays;
import java.util.Comparator;

/**
 * @author fantaixi
 * @create 2020-12-02 16:09
 */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }

    public static void main(String[] args) {
        String[] friends = {"Peter","Pual","Mary"};
        Arrays.sort(friends,new LengthComparator());
        System.out.println(friends.toString());
    }
}
