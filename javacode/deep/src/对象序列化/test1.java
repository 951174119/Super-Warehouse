package 对象序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 作用：以内存为基准，把内存中的对象存储到磁盘文件中去，称为对象序列化
 * ObjectOutputStream
 */
public class test1 {
    public static void main(String[] args) throws Exception {
        Student s1=new Student("jia",18);
        //对象序列化，使用对象字节输出流包装字节输出流管道
        ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream("deep\\src\\data"));
        //调用序列化方法
        oos1.writeObject(s1);
        //释放资源
        oos1.close();
    }
}















