package StringBuilder;

/**
 * StringBuilder是一个可变的字符串类，我们可以把它看成是一个对象容器
 * 作用：提高字符串的操作效率，如拼接、修改
 */
public class texst1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("a");
        sb.append(1.2);
        sb.append(false);
        System.out.println(sb);//打印出来不是地址
        StringBuilder SB=new StringBuilder();
        //支持链式编程
        SB.append(1).append("Hi").append(23);
        System.out.println(SB);
        //反转
        SB.reverse().append("00");
        System.out.println(SB);
        System.out.println(SB.length());
        //恢复成String类型
        String zfc=SB.toString();

    }
}
