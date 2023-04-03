package 反射;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class text3 {
    //getDeclaredConstructor() 获取某个构造器,无限制
    @Test
    public void getcon4() throws Exception {
        Class c3 = student.class;
        //按照参数定位无参数构造器
        Constructor con3 = c3.getDeclaredConstructor();
        //如果遇到私有构造器可以暴力反射
        con3.setAccessible(true);//权限被打开
        student s1=(student)con3.newInstance();
        System.out.println(con3.getName()+"->"+con3.getParameterCount());
    }
}
