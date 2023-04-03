package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Stream流
 * 目的：用于简化集合数组操作的API
 * 流只能使用一次
 */
public class test1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        Collections.addAll(names,"1","2","3","34","36");
        System.out.println(names);
        List<String> name3=new ArrayList<>();
        for (String name : names) {
            if(name.startsWith("3"))
                name3.add(name);
        }
        //Stream实现
        names.stream().filter(s->s.startsWith("3")).filter(s->s.length()==2).forEach(s-> System.out.println(s));//filter过滤器
    }
}


















































