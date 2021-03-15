import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @author fantaixi
 * @create 2020-11-30 6:21
 */
public class MainTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.printf("%tQ",new Date());
        System.out.println();
        System.out.printf("%tF",new Date());
        System.out.println();
        System.out.printf("%1$s %2$tB %2$te,%2$tY","Due date:",new Date());
        System.out.println();

    }
}
