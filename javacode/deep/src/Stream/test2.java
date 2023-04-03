package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {
        Collection<String> list1=new ArrayList<>();
        list1.add("21");
        list1.add("87");
        list1.add("435");
        list1.add("67");
        list1.add("211");
        list1.add("23");
        Stream<String> List1=list1.stream();
        Map<String,Integer> list2=new HashMap<>();
        Stream<String> List2=list2.keySet().stream();//键流
        Stream<Integer> List3=list2.values().stream();//值流
        Stream<Map.Entry<String,Integer>> List4=list2.entrySet().stream();//键值对流
        String[] names={"12","14","435","1234"};
        Stream<String> List5= Arrays.stream(names);//数组获取流
        Stream<String> List6= Stream.of(names);//数组获取流
        List5.limit(2).forEach(s-> System.out.println(s));//取前几个元素
        List6.skip(3).forEach(s-> System.out.println(s));//跳过前几个
        //Map加工方法
//        List1.map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return "00"+s;
//            }
//        });
        List1.map(s-> "00"+s).forEach(s-> System.out.println(s));
        //合并流
        Collection<String> list7=new ArrayList<>();
        list7.add("21");
        list7.add("87");
        list7.add("435");
        list7.add("67");
        list7.add("211");
        list7.add("23");
        Stream<String> s1=list7.stream();
        Collection<String> list8=new ArrayList<>();
        list8.add("210000");
        Stream<String> s2=list8.stream();
        Stream<String> stream1=Stream.concat(s1,s2);
        stream1.forEach(s-> System.out.println(s));
    }
}
