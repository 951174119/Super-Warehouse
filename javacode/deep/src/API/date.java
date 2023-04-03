package API;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 学会使用date类处理时间，获取时间的信息
 */
public class date {
    public static void main(String[] args) {
        //1。创建一个Date类的对象，代表系统此刻日期事件对象
        Date d = new Date();
        System.out.println(d);
        //当前时间毫秒值
        long t=d.getTime();
        System.out.println(t);
        //时间毫秒值转化回日期
        Date date=new Date(t);
        System.out.println(date);
        Date dd=new Date();
        dd.setTime(t);
        System.out.println(dd);

    }
}
