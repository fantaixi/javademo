package controller;

/**
 * @author fantaixi
 * @create 2021-01-08 9:50
 */
public class SystemUtil {
    public static boolean isAdmin(String userId) {
        return userId.toLowerCase() == "admin";
    }

    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }
}