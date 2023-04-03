package 异常处理;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常处理方式
 * 1.throw：用在方法上，可以将方法内部出现的异常抛出去给本方法的调用者处理
 * 这种方法并不好，发生异常的方法自己不处理异常，如果异常最终抛出去给虚拟机将引起程序死亡
 * 2.try...catch...:监视捕获异常，用在方法内部，可以将方法内部出现的异常直接捕获处理
 * 3.两种结合
 */
public class test2 {
    public static void main(String[] args) {
        //监视捕获异常
        String date="2015-01-01";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d= null;//编译时异常
        try {
            d = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();//打印异常栈信息
            System.out.println("false");
        }
        System.out.println(d);
    }
}







































