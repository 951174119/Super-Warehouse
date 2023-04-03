package 打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 打印流
 * 作用：打印流可以实现方便、高效的打印数据到文件中去
 * PrintStream   PrintWriter
 * 可以实现打印什么数据就是什么数据
 */
public class test1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream p1=new PrintStream("deep\\src\\data1");
        p1.println(234);
        p1.println('a');
        p1.println("你好");
        p1.write('a');

        System.out.println("abc");
        System.out.println("abc");
        System.setOut(p1);
        System.out.println("abc");
        p1.close();
        PrintWriter p2=new PrintWriter("deep\\src\\data1.txt");//打印上与前面的没有区别
    }
}
