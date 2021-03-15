package 枚举;

/**
 * @author fantaixi
 * @create 2020-11-27 4:08
 */
public class SizeTest {
    public static void main(String[] args) {
        Size s = Enum.valueOf(Size.class,"SMALL");
        System.out.println(s.toString());
        System.out.println();
        Size[] values = Size.values();
        for(Size sb:values){
            System.out.println(sb);
        }
    }
}
