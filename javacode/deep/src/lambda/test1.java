package lambda;

/**
 *Lambda表达式只能简化函数式接口的匿名内部类的写法形式
 */
public class test1 {
    public static void main(String[] args) {
        Animal a=new Animal() {
            @Override
            public void run() {
                System.out.println("fast");
            }
        };
    }

}

abstract class Animal{
    public void run(){};
}































