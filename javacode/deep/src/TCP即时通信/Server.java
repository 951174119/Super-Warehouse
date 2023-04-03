package TCP即时通信;

import 网络编程.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Server {
    //定义一个静态的List集合存储当前全部在线的socket管道
    public static List<Socket> allSocket=new ArrayList<>();
    //使用静态变量记住一个线程池对象
    private static ExecutorService pool=new ThreadPoolExecutor(3,5,6,
            TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) throws Exception {

        //服务端
        try {
            ServerSocket s2=new ServerSocket(7777);

            while (true){
                Socket s3=s2.accept();
                System.out.println(s3.getRemoteSocketAddress()+"is coming");
                pool.execute(new serverclass(s3));
                allSocket.add(s3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class serverclass implements Runnable{
    private Socket sk;

    public serverclass(Socket sk) {
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
                //把这个消息进行端口转发给所有客户端
                sendMsgToAll(msg);
            }

        } catch (Exception e) {
            System.out.println("xia xian le");
            Server.allSocket.remove(sk);
        }
    }
    private void sendMsgToAll(String msg) throws IOException {
        for (Socket socket : Server.allSocket) {
            PrintStream ps=new PrintStream(socket.getOutputStream());
            if (this.sk!=socket)
            ps.println(msg);
            ps.flush();
        }
    }
}






















