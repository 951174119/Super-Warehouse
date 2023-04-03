package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Map集合是一种双列集合，每个元素包含两个数据
 * Map集合的每个元素的格式：key=value（键值对元素）
 * Map集合也被称为“键值对集合”
 * Map集合的特点都是由键决定的
 * Map集合的键是无序，不重复的。无索引的，值不做要求（可以重复）
 * Map集合后面重复的键对应的值会覆盖前面重复键的值
 * Map集合的键值对都可以为null
 */
public class test1 {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap();
        map1.put("1",1);
        map1.put("2",2);
        map1.put("3",2);
        map1.put("1",5);//覆盖前面键值相同的值
        map1.put(null,null);
        System.out.println(map1);
        System.out.println("--------------------");
        //LinkedHashMap:元素按照键是有序，不重复，无索引，值不做要求
        Map<String,Integer> map2=new LinkedHashMap<>();
        map2.put("1",1);
        map2.put("2",2);
        map2.put("3",2);
        map2.put("1",5);//覆盖前面键值相同的值
        map2.put(null,null);
        System.out.println(map2);
        System.out.println(map2.get("1"));//获取键对应的值
        map2.remove("1");//删除键及对应的值
        System.out.println(map2);
        System.out.println(map2.containsKey("1"));//判断是否包含某个键
        System.out.println(map2.containsKey("2"));
        System.out.println(map2.containsValue(100));//判断是否包含某个值
        System.out.println(map2.containsValue(2));//判断是否包含某个值
        System.out.println(map2.keySet());//获取全部键的集合 返回Set类型
        System.out.println(map2.values());//获取全部值的集合 返回Collection类型
        System.out.println(map2.size());//大小
        //合并
        Map<String,Integer> map3=new LinkedHashMap<>();
        map3.put("4",6);
        map3.put("6",6);
        map2.putAll(map3);
        System.out.println(map2);
        System.out.println(map3);
        map3.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+"="+integer);
            }
        });
        map2.forEach((s,i)->{
            System.out.println(s+"="+i);
        });

    }
}






























