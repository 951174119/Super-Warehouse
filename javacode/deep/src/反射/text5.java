package 反射;

import org.junit.Test;

import java.lang.reflect.Method;

public class text5 {
    @Test
    public void getmethod(){
        //获取类对象
        Class c=student.class;
        Method[] met=c.getDeclaredMethods();
        for (Method method : met) {
            System.out.println(method.getName() + " ->" + method.getReturnType() + "->" + method.getParameterCount());
        }
    }
    @Test
    public void getmethod1() throws Exception {
        //获取类对象
        Class c=student.class;
        Method method=c.getDeclaredMethod("eat",String.class);
        System.out.println(method.getName() + " ->" + method.getReturnType() + "->" + method.getParameterCount());
        student s=new student();
        method.setAccessible(true);//暴力打开权限
        System.out.println(method.invoke(s, "meet"));//如果方法没有返回值，返回null
    }
}

















