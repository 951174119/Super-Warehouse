package 匿名内部类;

/**
 * 本质上是一个没有名字的局部内部类，定义在方法中、代码块中等
 * 作用：方便创建子类对象，最终目的为了简化代码编写
 */
public class test1 {
    public static void main(String[] args) {
        animal a=new dog();
        a.run();
        animal b=new animal() {
            @Override
            public void run() {
            }//
        };//匿名内部类,不是animal对象,抽象类不能产生对象
    }
}
class dog extends animal{
    @Override
    public void run() {
        System.out.println("gou");
    }
}
abstract class animal{
    public abstract void run();
}