package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.utils.Collections:是集合工具类
 * 作用：Collections并不属于集合，是用来操作集合的工具类
 */
public class test1 {
    public static void main(String[] args) {
        //添加元素
        List<String> list1=new ArrayList<>();
        list1.add("nihao");
        list1.add("ni");
        list1.add("hellow");
        list1.add("hi");
        System.out.println(list1);
        Collections.addAll(list1,"123","123434");
        System.out.println(list1);
        //打乱集合数据
        Collections.shuffle(list1);
        System.out.println(list1);
    }
}
