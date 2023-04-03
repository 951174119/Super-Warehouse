package system;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        //终止当前运行的java虚拟机，非零表示异常终止
        //System.exit(0);//正常终止  JVM终止  不要用
        //返回当前系统的时间毫秒值形式,返回从1970-1-1 00：00：00（算C语言的生日） 走到此刻的总毫秒值，时间毫秒值
        long t1=System.currentTimeMillis();
        System.out.println(t1);
        System.out.println("zhixingshijian");
        long t2=System.currentTimeMillis();
        System.out.println(t2);
        System.out.println(t2-t1);
        //数组拷贝
        int[] a1={2,3,4,5,5,67,8,5};
        int[] a2={0,0,0,0,0,0,0,0};
        System.arraycopy(a1,4,a2,1,4);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
