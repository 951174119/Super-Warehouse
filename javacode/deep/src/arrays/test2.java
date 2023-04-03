package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class test2 {
    public static void main(String[] args) {
        int[] arr1={12,43,54,53,4523,12,3,345};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);//默认升序排序
        System.out.println(Arrays.toString(arr1));
        //自定义比较器对象，只能支持引用类型的排序,对象必须是引用数据类型
        Integer[] arr2={12,43,54,53,4523,12,3,345};
        Arrays.sort(arr2, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr2));
    }
}
