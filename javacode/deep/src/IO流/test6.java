package IO流;

import java.io.*;

public class test6 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输入流
        try {
            InputStream i1=new FileInputStream("C:\\Users\\jiatianle\\Desktop\\文件\\63808197962950.png");
            //2.创建一个字节输出流管道与目标文件接通
            OutputStream o1=new FileOutputStream("C:\\Users\\jiatianle\\Desktop\\文件\\new.png");
            //定义一个字节数组转移数据
            byte[] b1=new byte[1024];
            int len;//记录每次读取的字节数
            while((len =i1.read(b1))!=-1){
                o1.write(b1,0,len);
            }
            System.out.println("true");
            o1.close();
            i1.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
