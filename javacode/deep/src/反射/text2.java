package 反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
//getConstructors() 获取全部的构造器：只能获取public修饰的构造器
public class text2 {
    @Test
    public void getcon1() {
        Class c = student.class;
        Constructor[] con = c.getConstructors();
        for (Constructor constructor : con) {
            System.out.println(constructor.getName()+"->"+constructor.getParameterCount());
        }
    }
    //getDeclaredConstructors() 获取全部构造器，除了public的也包括
    @Test
    public void getcon2() {
        Class c1 = student.class;
        Constructor[] con1 = c1.getDeclaredConstructors();
        for (Constructor constructor : con1) {
            System.out.println(constructor.getName()+"->"+constructor.getParameterCount());
        }
    }
    //getConstructor() 获取某个构造器，只能拿public修饰的某个构造器
    @Test
    public void getcon3() throws Exception {
        Class c2 = student.class;
        //按照参数定位构造器
        Constructor con2 = c2.getConstructor(String.class,int.class,String.class);
            System.out.println(con2.getName()+"->"+con2.getParameterCount());
    }
    //getDeclaredConstructor() 获取某个构造器,无限制
    @Test
    public void getcon4() throws Exception {
        Class c3 = student.class;
        //按照参数定位无参数构造器
        Constructor con3 = c3.getDeclaredConstructor();
        System.out.println(con3.getName()+"->"+con3.getParameterCount());
    }
}



























