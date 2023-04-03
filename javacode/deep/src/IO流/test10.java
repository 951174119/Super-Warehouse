package IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class test10 {
    public static void main(String[] args) throws Exception {
        //目标：每次读取一个字符
        //1.创建一个字符输入流管道与源文件接通
        Reader f1=new FileReader("deep\\src\\data");
        //2.读取一个字符返回，没有字符可读了返回-1
//        int code=f1.read();
//        System.out.println(code);
//        System.out.println((char)code);
//        int code1=f1.read();
//        System.out.println(code1);
//        System.out.println((char)code1);
//        int code2;
//        while ((code2=f1.read())!=-1){
//            System.out.println((char) code2);
//        }
        char[] ch=new char[1024];
        int len;
        while ((len=f1.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
    }
}
