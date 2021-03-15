

/**
 * @author fantaixi
 * @create 2020-11-25 4:18
 */
//参数是基本数据类型
//public class Cmower {
//    public static void main(String[] args) {
//        Cmower cmower = new Cmower();
//        int age = 18;
//        cmower.sop(age);
//        System.out.println("main 中的 age " + age);
//    }
//
//    public void sop(int age) {
//        age = 28;
//        System.out.println("sop 中的 age " + age);
//    }
//}

//参数是引用数据类型
public class Cmower {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cmower cmower = new Cmower();
        cmower.setName("沉默王二");

        Cmower old = cmower;
        cmower.sop(cmower);
        System.out.println("main 中的 cmower " + cmower.getName());

        System.out.println(old == cmower);

    }

    public void sop(Cmower cmower) {
        cmower.setName("沉默王三");
        System.out.println("sop 中的 cmower " + cmower.getName());
    }


}
