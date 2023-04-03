package IO流;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 字符集
 * ASCLL字符集：包括了数字、英文、符号
 * ASCLL使用1个字节存储一个字符，一个字节是8位，总共可以表示128个字符信息，对于英文，数字来说是够用的
 * GBK：window系统默认的码表，兼容ASCLL码表，也包含了几万个汉字，并支持繁体汉字以及部分日韩文字
 * 注意：GBK是中国的码表，一个中文以两个字节的形式存储，但不包含世界上所有国家的文字
 * Unicode码表：（又称统一码、万国码、单一码）是计算机科学领域里一项业界字符编码标准
 * 容纳世界上大多数国家的所有常见文字和符号
 * 以UTF-8编码后一个中文一般以三个字节的形式存储
 */
public class test1 {
    /**
     * 进行文字的编码和解码
     */
    public static void main(String[] args) {
        //1.编码：把文字转换成字节（使用指定的编码）
        String name="加油拆哪";
        byte[] bytes=name.getBytes();
        System.out.println(Arrays.toString(bytes));
        //2.解码：把字节转换成对应的中文形式
        String re=new String(bytes);
        System.out.println(re);
    }
}
