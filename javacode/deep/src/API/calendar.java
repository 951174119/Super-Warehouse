package API;

import java.time.Month;
import java.util.Calendar;

/**
 * Calendar代表了系统此刻日期对应的日历对象
 * Calendar是一个抽象类，不能直接创建对象
 */
public class calendar {
    public static void main(String[] args) {
        //1.拿到系统此刻日历对象
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        //2.获取日历的信息，取日期中某个字段信息
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        //3.修改日历的某个字段信息
        //cal.set(Calendar.YEAR,2020);
        //System.out.println(cal.get(Calendar.YEAR));

        //4.为某个字段增加/减少指定的值
        //请问64天后是什么时间
        cal.add(Calendar.DAY_OF_YEAR,64);
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        //5.拿到此刻日期对象(64天后)
        System.out.println(cal.getTime());
        //6.拿到此刻时间毫秒值
        System.out.println(cal.getTimeInMillis());

    }
}
