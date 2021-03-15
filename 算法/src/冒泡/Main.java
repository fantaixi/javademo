package 冒泡;

import java.util.Arrays;

/**
 依次比较相邻的两个数，将小数放在前面，大数放在后面。
 实现思路：用二重循环实现，外循环变量设为i，内循环变量设为j。
 假如有n个数需要进行排序，则外循环重复n-1次，内循环依次重复n-1，n-2，...，1次。
 每次进行比较的两个元素都是与内循环j有关的，它们可以分别用a[j]和a[j+1]标识，i的值依次为1,2,...,n-1，
 对于每一个i，j的值依次为0,1,2,...n-i 。
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2,9,10,0};
        MaoPao(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void MaoPao(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
