package 网络编程;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * UDP通信
 * 发送端
 */
public class test2 {
    public static void main(String[] args) throws Exception {
        //创建发送端对象
        DatagramSocket socket1=new DatagramSocket(6666);
        //创建一个数据包对象封装数据
        DatagramPacket packet1=new DatagramPacket("1111".getBytes(StandardCharsets.UTF_8),4, InetAddress.getLocalHost(),8888);
        //发送数据
        socket1.send(packet1);
        socket1.close();
    }
}




























