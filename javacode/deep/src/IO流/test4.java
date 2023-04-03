package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class test4 {
    /**
     *目标：使用文件字节输入流一次性读完文件的全部字节
     */
    public static void main(String[] args) throws Exception {
        File f=new File("deep\\src\\data");
        InputStream i1=new FileInputStream(new File("deep\\src\\data"));
//        byte[] b1=new byte[(int)f.length()];
//        int len=i1.read(b1);
//        System.out.println(len);
//        System.out.println(f.length());
//        System.out.println(new String(b1));
        byte[] b2=i1.readAllBytes();
        System.out.println(new String(b2));
    }
}
















