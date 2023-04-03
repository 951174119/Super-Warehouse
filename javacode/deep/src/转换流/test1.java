package 转换流;

import java.io.*;

/**
 * InputStreamReader 字符输入转换流
 * OutputStreamWrite 字符输出转换流
 */
public class test1 {
    public static void main(String[] args) throws Exception {
        //原始字节流
        InputStream f1=new FileInputStream("deep\\src\\data");
        //以指定的编码转换成字符输入流
        Reader f2=new InputStreamReader(f1,"UTF-8");
        //字节输出流
        OutputStream f3=new FileOutputStream("deep\\src\\data");
        //
        Writer f4=new OutputStreamWriter(f3,"UTF-8");
    }
}
