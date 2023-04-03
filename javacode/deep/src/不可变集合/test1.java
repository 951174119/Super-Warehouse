package 不可变集合;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 不可变集合就是不可被修改的集合
 * 集合的数据项在创建的时候就提供了，并且在整个生命周期中都不可改变，否则报错
 *
 */
public class test1 {
    public static void main(String[] args) {
        List<Double> list1=List.of(123.7,234.5,23.8,434.0);//不可变集合
        Set<Double> list2=Set.of(123.7,234.5,23.8,434.0);//不可变集合
        Map<Double,Double> list3=Map.of(123.7,234.5,23.8,434.0);//不可变集合
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

    }
}




























