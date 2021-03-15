import java.util.Scanner;

/**
 * @author fantaixi
 * @create 2020-11-23 17:07
 */
public class Main {
    public static void main(String[] args) {
        //for (int i=10;i>0;i--){
        //    System.out.println("aaa");
        //}
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0,goal =0;
        while (sum < goal){
            System.out.println("输入一个数：");
            if (n<0)
                continue;
            sum += n;
        }
        System.out.println(sum);
    }
}
