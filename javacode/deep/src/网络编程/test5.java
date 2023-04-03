package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class test5 {
    public static void main(String[] args) throws Exception {
        //注册端口
        try {
            ServerSocket s2=new ServerSocket(7777);
            Socket s3=s2.accept();
            InputStream is=s3.getInputStream();
            //把字节输入流包装成缓冲字符输入流
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String msg;
            if ((msg=br.readLine())!=null){
                System.out.println(s3.getRemoteSocketAddress()+":"+msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

















