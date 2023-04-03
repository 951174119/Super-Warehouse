package 网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 接收端
 */
public class test3 {
    public static void main(String[] args) throws Exception {
        //1.创建接收端对象
        DatagramSocket socket2=new DatagramSocket(8888);
        //创建一个数据包对象接收数据
        byte[] b1=new byte[1024*64];
        DatagramPacket packet2=new DatagramPacket(b1,b1.length);
        //等待接收数据
        socket2.receive(packet2);
        int len=packet2.getLength();//接收数据的长度
        System.out.println(packet2.getSocketAddress());//发送方IP地址
        System.out.println(packet2.getPort());//发送方端口
        System.out.println(new String(b1));
        socket2.close();
    }
}














