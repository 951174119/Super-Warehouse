package 文件;

import API.SimpleDateFormat_;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * File类可以定位文件：进行删除、获取文本本身信息等操作。但是不能读写文件内容
 * IO流技术可以对硬盘中的文件进行读写
 *
 */
public class test1 {
    public static void main(String[] args) {
        //创建File文件对象,不存在也能创建成功
        File f=new File("C:\\Users\\jiatianle\\Desktop\\文件\\63808197962950.png");
        System.out.println(f.length());//字节大小
        //File创建对象，支持绝对路径和相对路径
        //File创建对象可以是文件也可以是文件夹
        System.out.println(f.exists());//判断文件或文件夹是否存在
        //判断是否是文件夹
        System.out.println(f.isDirectory());
        //判断是否是文件
        System.out.println(f.isFile());
        //获取文件的绝对路径
        System.out.println(f.getAbsolutePath());
        //获取文件定义时使用的路径
        System.out.println(f.getPath());
        //获取文件的名称带后缀
        System.out.println(f.getName());
        //获取文件的最后修改时间（时间毫秒值）
        long time=f.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
    }
}


























