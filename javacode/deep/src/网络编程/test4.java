package 网络编程;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * TCP通信
 * Socket网络编程
 */
public class test4 {
    public static void main(String[] args) throws Exception {
        //创建Socket通信管道请求与服务器的连接
        try {
            Socket s1=new Socket("127.0.0.1",7777);
            //从Socket通信管道中得到一个字节输出流，负责发送数据
            OutputStream os=s1.getOutputStream();
            //把低级的字节流打包成打印流
            PrintStream ps=new PrintStream(os);
            //发送消息
            ps.println("nihao");
            ps.flush();//刷新
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


















