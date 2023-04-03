package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 用于解决浮点型运算精度失真的问题
 * BigDecimal一定要精度运算，若是除不尽会报错
 */
public class test1 {
    public static void main(String[] args) {
        double a=0.1;
        double b=0.2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println("-----------------");
        BigDecimal a1=BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);
        BigDecimal c=a1.add(b1);//加
        BigDecimal d=a1.subtract(b1);//减
        BigDecimal e=a1.multiply(b1);//乘
        BigDecimal f=a1.divide(b1);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //转回double类型
        double g=c.doubleValue();
        System.out.println("-----------------");
        //解决除不尽时报错的问题
        BigDecimal x1=BigDecimal.valueOf(10);
        BigDecimal x2=BigDecimal.valueOf(3);
        BigDecimal n=x1.divide(x2,2, RoundingMode.HALF_UP);//四舍五入
        System.out.println(n);

    }
}
