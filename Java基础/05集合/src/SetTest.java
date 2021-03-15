import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author fantaixi
 * @create 2020-12-08 17:09
 */
public class SetTest {
    public static void main(String[] args) {
        var words= new HashSet<String>();
        long totalTime = 0;
        try (var in = new Scanner(System.in))
        {
            while (in.hasNext()){
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        Iterator<String> iter = words.iterator();
        for (int i = 1; i < 20 && iter.hasNext(); i++) {
            System.out.println(iter.next());
            System.out.println("...");
            System.out.println(words.size()+"单词数、"+totalTime+"秒");
        }
    }
}
