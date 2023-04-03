package 集合;

import java.util.*;

/**
 * 集合中只能存储引用类型数据，如果要存储基本类型数据可以选用包装类
 * Collection 单列集合，每个元素（数据）只包含一个值
 * List系列集合：添加的元素是有序、可重复、有索引。
 * ArrayList、LinekdList：有序、可重复、有索引
 * Set系列集合：添加的元素是无序、不重复、无索引
 * HashSet:无需、不重复、无索引  LinkedHashSet：有序、不重复、无索引 TreeSet：按照大小默认升序排序、不重复、无索引
 * Map双列集合，每个元素包含两个值（键值对）
 */
public class test1 {
    public static void main(String[] args) {
        //有序、可重复、有索引
        Collection List=new ArrayList();
        List.add("Java");
        List.add("123");
        List.add(23324);
        System.out.println(List);
        System.out.println(List.size());
        List.clear();
        System.out.println(List);
        System.out.println(List.isEmpty());
        System.out.println("------------------------");
        Collection List1=new ArrayList();
        List1.add("123");
        List1.add("123");
        List1.add("12344");
        List1.add("34523");
        System.out.println(List1);
        Object A=List1.toArray();
        System.out.println(A.getClass());

        //System.out.println(Arrays.toString(arr));
        List1.remove("123");
        System.out.println(List1);
        System.out.println(List1.contains("123"));
        System.out.println(List1.isEmpty());
        List1.clear();
        System.out.println(List1.contains("123"));
        System.out.println("--------------------------");
        Collection<String> SList=new ArrayList<>();
//        SList.add(123);
        SList.add("123");
        System.out.println(SList);
    }

}










