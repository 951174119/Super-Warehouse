package IO流;

import java.io.*;

/**
 * IO流也称为输入、输出流，就是用来读写数据的
 * 按流的方向分
 * 输入流
 * 输出流
 * 按流中的数据最小单位分为
 * 字节流
 * 字符流（更适合读文本内容）
 * 总结流的四大类
 * 字节输入流(InputStream)：以内存为基准，来自磁盘文件/网络中的数据以字节的形式读入到内存中去的流
 * 字节输出流(OutputStream)：以内存为基准，把内存中的数据以字节写出到磁盘文件或者网络中去的流
 * 字符输入流(Reader)：以内存为基准，来自磁盘文件/网络中的数据以字符的形式读入到内存中去的流
 * 字符输出流(Writer)：以内存为基准，把内存中的数据以字符写出到磁盘文件或者网络介质中去的流
 */
public class test2 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输入流管道与源文件接通
        InputStream i1=new FileInputStream(new File("deep\\src\\data"));
//        //2.读取一个字节返回
//        int b1=i1.read();//每次读取一个字节返回，如果字节已经没有可读的返回-1
//        System.out.println((char) b1);
//        int b2=i1.read();
//        System.out.println(b2);
//        System.out.println((char)b2);
        //使用循环改进
        int b;
        while ((b=i1.read())!=-1){
            System.out.println((char) b);
        }
    }
}

























