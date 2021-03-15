import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author fantaixi
 * @create 2020-11-21 17:28
 */
public class Main1 {
    public static void main(String[] args) throws IOException {
        //String a = "aaaefg";
        //int aLength = a.codePointCount(0,a.length());  //获取码点数量
        //System.out.println("Aaa".equalsIgnoreCase(a)); //忽略大小写 比较字符串是否相等
        //System.out.println(aLength);
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("输入名字");
        //String name = scanner.nextLine();
        //System.out.println("输入年纪");
        //int age = scanner.nextInt();
        //System.out.printf("你好,%s,你有%d岁",name,age);
        //System.out.println(new Date());
        Scanner scanner = new Scanner(Paths.get("myfile.txt"), "utf-8");
        
    }
}
