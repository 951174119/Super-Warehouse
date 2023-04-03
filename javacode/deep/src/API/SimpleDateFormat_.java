package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 可以对Date对象或时间毫秒值格式化成我们喜欢的时间形式
 * 也可以把字符串的时间形式解析成日期对象
 */
public class SimpleDateFormat_ {
    public static void main(String[] args) throws ParseException {
        //日期对象
        Date d=new Date();
        System.out.println(d);
        //格式化这个日期对象或时间毫秒值（指定最终格式化形式）
        //y 年 M 月 d 日 H 时 m 分 s 秒 E 星期几 a ×午
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy MM dd HH:mm:ss EEE a");
        System.out.println(sdf.format(d));
        System.out.println(sdf.format(System.currentTimeMillis()));
        //解析字符串时间
        //把字符串时间拿到程序中来
        String dateStr="2021年08月06日 11：11：11";
        //把字符串时间解析成日期对象，形式必须要和被解析时间格式完全一样
        SimpleDateFormat a= new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
        Date dd=a.parse(dateStr);
        //往后走2天14小时49分06秒
        long time =dd.getTime()+(2L*24*60*60+14*60*60+49*60+6)*1000;//L防止超出范围
        //格式化这个时间毫秒值就是结果
        System.out.println(sdf.format(time));
    }
}
