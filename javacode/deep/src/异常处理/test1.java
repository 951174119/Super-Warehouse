package 异常处理;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Error：系统级别问题，jvm退出等，代码无法控制
 * Exception：java.lang包下，称为异常类，它表示程序本身可以处理的问题
 * RuntimeException及其子类：运行时异常，编译阶段不会报错。（空指针异常，数组索引越界异常）
 * 除RuntimeException之外所有的异常：编译期必须处理的，否则程序不能通过编译。（日期格式化异常）
 * 数组索引越界异常
 * 空指针异常
 * 类型转换异常
 *数学操作异常
 * 数字转换异常
 * 编译时异常作用：是担心程序员的技术不行，在编译阶段就爆出一个错误，目的在于提醒不要出错
 */
public class test1 {
    public static void main(String[] args) throws ParseException {//抛出异常
        String date="2015-01-01";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d=sdf.parse(date);//编译时异常
        System.out.println(d);
    }
}



























