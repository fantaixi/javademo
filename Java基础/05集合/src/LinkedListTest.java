import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author fantaixi
 * @create 2020-12-08 14:32
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<String>();
        a.add("a1");
        a.add("a2");
        a.add("a3");

        LinkedList<String> b = new LinkedList<>();
        b.add("b1");
        b.add("b2");
        b.add("b3");
        b.add("b4");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()){
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

        bIter= b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if (bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);
    }
}
