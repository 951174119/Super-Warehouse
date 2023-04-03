package 日期API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalDate、LocalTime、LocalDateTime
 * 它们分别表示日期，时间，日期时间对象，他们的类的实例是不可变的对象
 * 他们三者构建对象和API都是通用的
 */
public class test {
    public static void main(String[] args) {
        //LocalDate
        LocalDate t1=LocalDate.now();
        System.out.println(t1);
        int year=t1.getYear();
        System.out.println(year);
        int month=t1.getMonthValue();
        System.out.println(month);
        int day=t1.getDayOfMonth();
        System.out.println(day);
        //LocalTime
        LocalTime t2=LocalTime.now();
        System.out.println(t2);
        System.out.println(t2.getHour());
        System.out.println(t2.getNano());//纳秒
        LocalDateTime.of(1991,11,11,8,20);//将时间固定在某一时刻
        //LocalDateTime
        LocalDateTime t3=LocalDateTime.now();
        System.out.println(t3);
        System.out.println(t3.toLocalDate());
        System.out.println(t3.toLocalTime());
        //时间的加减
        System.out.println(t3.minusDays(1));
        System.out.println(t3);
        System.out.println(t3.plusDays(1));
    }
}




























