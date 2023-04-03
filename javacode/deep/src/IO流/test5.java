package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class test5 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输出流管道与目标文件接通
        OutputStream os=new FileOutputStream("deep\\src\\data1.txt");
        //2.写数据出去
        //写一个字节出去
        os.write('q');
        os.write('1');
        os.write('a');
        //写一个字节数组出去
        byte[] b1={23,'q',56};
        os.write(b1);
        byte[] b2="你好".getBytes(StandardCharsets.UTF_8);
        os.write(b2);
        //写一个字节数组的一部分出去
        byte[] b3={'a','f',56,'q'};
        os.write(b3,0,2);
        //刷新数据
        os.flush();
        //释放资源,关闭后流不能使用了
        os.close();
    }
}
