package 网络编程;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 实现网络编程关键的三要素
 * IP地址：设备在网络中的地址，是唯一的标识
 * 全称“互联网协议地址”，是分配给上网设备的唯一标识
 * 分类：IPv4（4字节）、IPv6（16字节）
 * IP地址形式：公网地址、私有地址（局域网使用）
 * IP常用命令ipconfig：查看本机IP地址 ping IP地址：检查网络是否连接
 * 特殊IP地址：本机IP：127.0.0.1或者localhost：称为回送地址也可称本地回环地址，只会寻找当前所在本机
 * 端口：应用程序在设备中唯一的标识
 * 端口号：标识正在计算机设备上运行的进程（程序），被规定为一个16位的二进制，范围是0-65535
 * 周知端口：0-1023，被预先定义的知名应用占用（如HTTP占用80，FTP占用21
 * 注册端口：1024-49151，分配给用户进程或某些应用程序（如：Tomcat占8080，MySQL占用3306
 * 动态端口：49152到65535，之所以称为动态端口，是因为它一般不固定分配某种进程，而是动态分配
 * 注意：我们自己开发的程序选择注册端口，且一个设备中不能出现两个程序的端口号一样，否则出错
 * 协议：数据在网络中传输的规则，常见的协议有UDP协议（用户数据协议）和TCP协议（传输控制协议）
 * TCP协议特点
 * 使用TCP协议，必须双方先建立连接，它是一种面向连接的可靠通信协议
 * 传输前，采用“三次握手”方式建立连接，所以是可靠的
 * 在连接中可进行大数据量的传输
 * 连接、发送数据都需要确认，且传输完毕后，还需释放已建立的连接，通信效率较低
 * TCP协议通信场景
 * 对信息安全要求较高的场景：文件下载、金融等数据通信
 * UDP是一种无连接、不可靠传输的协议，传输快，一次64KB，不安全，容易造成数据丢失
 */
public class test1 {
    //IP地址操作类-inetAddress
    //此类标识Internet协议（IP）地址
    public static void main(String[] args) throws IOException {
        //获取本机地址对象
        InetAddress ip1=InetAddress.getLocalHost();
        System.out.println(ip1);
        System.out.println(ip1.getHostAddress());
        System.out.println(ip1.getHostName());//主机名
        //获取域名IP对象
        InetAddress ip2=InetAddress.getByName("www.baidu.com");
        System.out.println(ip2);
        //获取公网IP对象
        InetAddress ip3=InetAddress.getByName("www.baidu.com");
        System.out.println(ip3);
        //判断是否能通 ping 5s之前测试是否可通
        System.out.println(ip3.isReachable(5000));
    }
}




























