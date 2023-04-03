package third;

import java.util.Scanner;

public class final1 {
    public static final String Name="xiaoming";//变成常量了
    /**
     * final修饰类，表明该类是最终类，不可被继承
     * final修饰方法，表明该方法是最终方法，不能被重写
     * final修饰变量，表示该变量第一次赋值后，不能再次被赋值（有且仅能被赋值一次）
     * 变量：1.局部变量     2.成员变量  --静态成员变量  --实例成员变量
     * final修饰的变量是基本类型：那么变量存储的数据值不能发生改变。
     * final修饰的变量是引用类型：那么变量存储的地址值不能发生改变，但是地址指向的对象内容是可以发生变化的
     */
    public static void main(String[] args) {
        final double pi=3.14;
        //pi=2;
        //Name="xiaohong";
        final int[] array=new int[2];
        for (int i=0;i<2;i++) {
            System.out.println(array[i]);
        }
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void area(final double pi){
        //pi=1;
    }

}
