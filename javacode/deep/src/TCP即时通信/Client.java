package TCP即时通信;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {

        //创建Socket通信管道请求与服务器的连接
        try {
            Socket s1=new Socket("127.0.0.1",7777);
            //创建一个单独的线程专门负责这个客户端的读消息
            new ClientThread(s1).start();
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
class ClientThread extends Thread{
    private Socket sk;

    public ClientThread(Socket sk) {
        this.sk = sk;
    }

    @Override
    public void run() {
        try {
            InputStream is=sk.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg=br.readLine())!=null){
                System.out.println(sk.getRemoteSocketAddress()+":"+msg);
            }
        } catch (Exception e) {
            System.out.println("ti chu qun liao");
        }
    }
}






















