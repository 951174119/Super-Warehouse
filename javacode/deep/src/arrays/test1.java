package arrays;

import java.util.Arrays;

/**
 * 数组操作工具类，专门用于操作数组元素的
 */
public class test1 {
    public static void main(String[] args) {
        int[] arr1={12,43,54,53,4523,12,3,345};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.binarySearch(arr1, 12));
        System.out.println(Arrays.binarySearch(arr1, 1200));
    }
}
