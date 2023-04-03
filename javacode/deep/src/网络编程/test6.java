package 网络编程;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * TCP通信模型：线程池优化
 */
public class test6 {

    public static void main(String[] args) throws Exception {

        //创建Socket通信管道请求与服务器的连接
        try {
            Socket s1=new Socket("127.0.0.1",7777);
            //从Socket通信管道中得到一个字节输出流，负责发送数据
            OutputStream os=s1.getOutputStream();
            //把低级的字节流打包成打印流
            PrintStream ps=new PrintStream(os);
            Scanner sc=new Scanner(System.in);
            //发送消息
            while (true) {
                System.out.println("plase:");
                String S=sc.nextLine();
                ps.println(S);
                ps.flush();//刷新
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}























