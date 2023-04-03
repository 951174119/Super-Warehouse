package math;

public class test1 {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(-4));
        //向上取整
        System.out.println(Math.ceil(4.0001));
        //向下取整
        System.out.println(Math.floor(4.9999));
        //四舍五入
        System.out.println(Math.round(4.4));
        System.out.println(Math.round(4.5));
        System.out.println(Math.round(4.49999));
        //随机数
        System.out.println(Math.random());//默认是0-1之间的随机数
        System.out.println(Math.random()*6);//0-6之间
        System.out.println(Math.random()*6+6);//6-12之间

    }
}
