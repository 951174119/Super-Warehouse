package 日期API;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class test2 {
    public static void main(String[] args) {
        Instant I1=Instant.now();
        System.out.println(I1);
        //得到系统此刻的时间
        System.out.println(I1.atZone(ZoneId.systemDefault()));//默认时区
        Date D= Date.from(I1);
        System.out.println(D);
        System.out.println(D.toInstant());
    }
}
