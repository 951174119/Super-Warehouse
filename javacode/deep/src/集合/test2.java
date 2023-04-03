package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class test2 {
    public static void main(String[] args) {
        Collection<String> list1=new ArrayList<>();
        list1.add("123");
        list1.add("sdzf");
        list1.add("4532");
        System.out.println(list1);
        //迭代器
        Iterator<String> it=list1.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println("------------------------");
        //增强for循环：既可以遍历集合也可以遍历数组
        for (String ele:list1){
            System.out.println(ele);
        }
//        list1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        list1.forEach(s -> {
//            System.out.println(s);
//        });


//        list1.forEach(s -> System.out.println(s));

        list1.forEach(System.out::println);
    }
}
