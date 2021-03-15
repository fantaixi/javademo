package 枚举;

/**
 * @author fantaixi
 * @create 2020-11-27 4:04
 */
enum  Size {
    SMALL("S"),MEDIUM("M");
    private String abb;
    private Size(String abb){
        this.abb = abb;
    }
    public  String getAbb(){
        return  abb;
    }
}
