package 反射;

/**
 * 反射概述
 * 反射是在运行时获取类的字节码文件对象：然后可以解析类中的全部成分
 * 反射是指对于任何一个Class类，在“运行的时候”都可以直接得到这个类全部成分
 * 在运行时，可以直接得到这个类的构造器对象：Constructor 成员变量对象：Field 成员方法对象：Method
 * 反射的关键
 * 反射的第一步都是先得到编译后的Class类对象，然后就可以得到Class的全部成分
 */
public class text1 {
    public static void main(String[] args) throws Exception {
        //Class类中的一个静态方法：forName
        Class c=Class.forName("反射.student");
        System.out.println(c);//student.class
        //类名.class
        Class c1=student.class;
        System.out.println(c1);
        //对象.getClass（）
        student s1=new student("xiaoming",18,"nan");
        Class c2=s1.getClass();
        System.out.println(c2);
    }
}




























