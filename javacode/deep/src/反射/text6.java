package 反射;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 反射的作用-绕过编译阶段为集合添加数据
 * 反射是作用在运行时的技术，此时集合的泛型将不能产生约束了，此时是可以为集合存入其他任意类型的元素的
 * 泛型只是在编译阶段可以约束集合只能操作某种数据类型，在编译成Class文件进入运行阶段的时候，其真实类型都是ArrayList了，泛型相当于被擦除了
 */
public class text6 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println(list1.getClass() == list2.getClass());
        list1.add("asd");
        list1.add("adsf");
        //list1.add(12);
        Class c=list1.getClass();
        //定位c中的add方法
        Method add=c.getDeclaredMethod("add",Object.class);
        add.invoke(list1,12);
        System.out.println(list1);
    }
}


















