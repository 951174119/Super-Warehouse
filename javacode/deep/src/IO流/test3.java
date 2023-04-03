package IO流;

import java.io.*;

public class test3 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输入流管道与源文件接通
        InputStream i1=new FileInputStream(new File("deep\\src\\data"));
        //2.定义一个字节数组，用于读取字节数组
        byte[] b1=new byte[3];
        int len = i1.read(b1);
        System.out.println(len);
        String rs=new String(b1);
        System.out.println(rs);
        byte[] b2=new byte[3];
        int len2;
        while((len2=i1.read(b2))!=-1){
            System.out.println(new String(b2,0,len2));
        }
    }
}

























