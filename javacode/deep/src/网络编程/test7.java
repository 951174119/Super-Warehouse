package 网络编程;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class test7 {
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
           pool.execute(new server(s3));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

}
}
