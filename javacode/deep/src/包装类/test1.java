package 包装类;

/**
 * 其实就是8种基本数据类型对应的引用类型
 * 基本数据类型  引用数据类型
 * byte Byte;short Short;int Integer;long Long;char Character;float Float;double Double;boolean Boolean
 * 自动装箱：基本类型的数据和变量可以直接赋值给包装类型的变量
 * 自动拆箱：包装类型的变量可以直接复制给基本数据类型的变量
 * 引用类型的变量值可以为null，基本数据类型不可以
 */
public class test1 {
    public static void main(String[] args) {
        //int a=null;
        Integer b=null;
        Integer c=123;
        System.out.println(c.toString());
        System.out.println(Integer.toString(c));
        //可以把字符串类型的数值转换成真是的数据类型
        System.out.println(Integer.parseInt("123"));
        System.out.println(Double.parseDouble("1.23"));
        System.out.println(Integer.valueOf("199"));
    }
}
