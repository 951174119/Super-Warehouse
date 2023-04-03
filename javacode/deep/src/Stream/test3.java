package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 收集Stream流
 * 含义：就是把Stream流操作后的结果数据转回到集合或者数组中去
 * Stream流：方便操作集合/数组的手段
 * 集合/数组：才是开发中的目的
 */
public class test3 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("123");
        list1.add("177");
        list1.add("165");
        list1.add("134");
        list1.add("112323");
        list1.add("23");
        list1.add("1");
        Stream<String> List5= list1.stream();//数组获取流
        Stream<String> s = List5.limit(2);
        //List<String> name1=s.collect(Collectors.toList());
        List<String> name1=s.toList();
        System.out.println(name1);
    }
}



























