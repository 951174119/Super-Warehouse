package 继承;

import java.sql.SQLOutput;

public class test1 {
    public static void main(String[] args) {
        student S1=new student();
        S1.run();
        S1.setName("小明");
        System.out.println(S1.getName());
        iphone O1=new iphone();
        O1.call();
        System.out.println("----------------------");
        newiphone I1=new newiphone();
        I1.call();
    }
}
class iphone{
    public void call(){
        System.out.println("request call");
    }
}

class newiphone extends iphone{
    @Override//重写注解，放在重写后的方法上，作为重写是否正确的校验注解，提高代码可读性，优雅
    public void call(){
        super.call();
        System.out.println("false");//方法重写
    }
}