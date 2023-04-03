package 注解;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 注解的作用
 * 对Java中类、方法、成员变量做标记，然后进行特殊处理，至于到底做何种处理由业务需求来决定
 * 自定义注解：
 * 特殊属性
 * value属性，如果只有一个value属性的情况下，使用value属性的时候可以省略value名称不写
 * 但是如果有多个属性，且多个属性没有默认值，那么value名称是不能省略的
 * 元注解：
 * 就是注解注解的注解
 * @Target：约束自定义注解只能在哪些地方使用
 * @Retention：申明注解的生命周期
 * 注解的解析
 * 注解的操作中经常需要进行解析，注解的解析就是判断是否存在注解，存在注解就解析出内容
 * 与注解解析相关的接口
 * Annotation：注解的顶级接口，注解都是Annotation类型的对象
 * AnnotatedElement：该接口定义了与注解解析相关的解析方法
 */
public class text1 {
    @MyTest
    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
        System.out.println("test2");
    }
    @MyTest
    public void test3(){
        System.out.println("test3");
    }
    public void test4(){}
    public void test5(){}

    /**
     * 启动菜单，有注解的才被调用
     * @param args
     */
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        text1 t=new text1();
        //获取类对象
        Class c=text1.class;
        //提取全部方法
        Method[] met=c.getDeclaredMethods();
        //遍历方法，查看是否有注解，有就跑
        for (Method method : met) {
            if(method.isAnnotationPresent(MyTest.class)){
                method.invoke(t);
            }
        }
    }
}















