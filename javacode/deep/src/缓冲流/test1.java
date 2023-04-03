package 缓冲流;

import java.io.*;

/**
 * 缓冲流也称为高效流，或者高级流。之前学习的字节流可以称为原始流
 * 作用：缓冲流自带缓冲区、可以提高原始字节流、字符流读写数据的性能
 * BufferedInputStream字节缓冲输入流
 * BufferedOutputStream字节缓冲输出流
 * BufferedReader字符缓冲输入流
 * BufferedWriter字符缓冲输出流
 */
public class test1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输入流
        try {
            InputStream i1=new FileInputStream("C:\\Users\\jiatianle\\Desktop\\文件\\63808197962950.png");
            //把原始的字节输入流包装成高级的缓冲字节输入流
            InputStream i2=new BufferedInputStream(i1);
            //2.创建一个字节输出流管道与目标文件接通
            OutputStream o1=new FileOutputStream("C:\\Users\\jiatianle\\Desktop\\文件\\new.png");
            //把字节输出流管道包装成高级的缓冲字节输出流管道
            OutputStream o2=new BufferedOutputStream(o1);
            //定义一个字节数组转移数据
            byte[] b1=new byte[1024];
            int len;//记录每次读取的字节数
            while((len =i2.read(b1))!=-1){
                o2.write(b1,0,len);
            }
            System.out.println("true");
            o2.close();
            i2.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
