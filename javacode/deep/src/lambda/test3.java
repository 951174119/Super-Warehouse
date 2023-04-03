package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class test3 {
    public static void main(String[] args) {
        Integer[] arr={12,324,5,32,12,3};
        Arrays.sort(arr, ( o1,  o2)->  o1-o2);
//        Arrays.sort(arr, ( o1,  o2)-> {return o1-o2;});
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }

        System.out.println(Arrays.toString(arr));
    }
}
