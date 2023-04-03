package IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * try-catch-finally
 * finally:在异常处理时提供finally块来执行所有清除操作，比如说IO流中的释放资源
 * 特点：被finally控制的语句最终一定会执行，除非JVM退出
 * 异常处理标准格式：try...catch...finally
 */
public class test7 {
    public static void main(String[] args) throws Exception {
        InputStream i1=null;
        OutputStream o1=null;
        //1.创建一个字节输入流
        try {
            i1=new FileInputStream("C:\\Users\\jiatianle\\Desktop\\文件\\63808197962950.png");
            //2.创建一个字节输出流管道与目标文件接通
            o1=new FileOutputStream("C:\\Users\\jiatianle\\Desktop\\文件\\new.png");
            //定义一个字节数组转移数据
            byte[] b1=new byte[1024];
            int len;//记录每次读取的字节数
            while((len =i1.read(b1))!=-1){
                o1.write(b1,0,len);
            }
            System.out.println("true");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            //无论代码是正常结束，还是出现异常都要最后执行这里
            if (o1!=null) {
                o1.close();
            }
            if (i1!=null) {
                i1.close();
            }

        }

    }
}
