package IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class test8 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输入流
        try(
                //这里面只能放置资源对象，用完会自动关闭，自动调用资源的close方法
                InputStream i1=new FileInputStream("C:\\Users\\jiatianle\\Desktop\\文件\\63808197962950.png");
                OutputStream o1=new FileOutputStream("C:\\Users\\jiatianle\\Desktop\\文件\\new.png");
                ) {
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
