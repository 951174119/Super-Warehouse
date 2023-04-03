package 反射;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;

public class text4 {
    @Test
    public void getmenber(){
        Class c=student.class;
        //定位全部成员变量
        Field[] fields=c.getDeclaredFields();
        //遍历
        for (Field field : fields) {
            System.out.println(field.getName() + "->" + field.getType());
        }
    }
    @Test
    public void getmenber1() throws Exception {
        Class c=student.class;
        //根据名称定位某个成员变量
        Field f1=c.getDeclaredField("name");
        System.out.println(f1.getName() + "->" + f1.getType());
        student s=new student();
        f1.setAccessible(true);//暴力打开权限
        f1.set(s,"xiaoming");//赋值
        System.out.println(s);
        System.out.println(f1.get(s));
    }
}




















