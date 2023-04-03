package IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class test9 {
    public static void main(String[] args) throws Exception {
        InputStream i1=new FileInputStream("C:\\Users\\jiatianle\\Desktop\\文件\\63808197962950.png");
        OutputStream o1=new FileOutputStream("C:\\Users\\jiatianle\\Desktop\\文件\\new.png");
        try(i1;o1) {
            //定义一个字节数组转移数据
            byte[] b1 = new byte[1024];
            int len;//记录每次读取的字节数
            while ((len = i1.read(b1)) != -1) {
                o1.write(b1, 0, len);
            }
            System.out.println("true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
