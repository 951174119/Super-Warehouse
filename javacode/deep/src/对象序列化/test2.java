package 对象序列化;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 对象反序列化
 * ObjectInputStream
 * 作用：以内存为基准，把存储到磁盘文件中去的对象数据恢复成内存中的对象
 */
public class test2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream oos1=new ObjectInputStream(new FileInputStream("deep\\src\\data"));
        Student s2=(Student) oos1.readObject();
        System.out.println(s2);
    }
}
















