package 文件;

import java.io.File;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        File f=new File("deep\\src\\data");
        //创建新文件，若已经存在文件则返回false
        System.out.println(f.createNewFile());
        //创建一级目录
        File f1=new File("D:/abc/111");
        System.out.println(f1.exists());
        System.out.println(f1.mkdir());
        //创建多级目录
        File f2=new File("D:/abc/11/22/33");
        System.out.println(f2.mkdirs());
        //删除文件或空文件夹
        File f3=new File("deep\\src\\data1");
        f3.createNewFile();
        //f3.delete();//占用时也可以删除
        //遍历文件夹
        File f4=new File("C:\\Users\\jiatianle\\Desktop\\文件");
        String[] name=f4.list();
        for (String s : name) {
            System.out.println(s);
        }
        File[] f5=f4.listFiles();
        for (File file : f5) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
