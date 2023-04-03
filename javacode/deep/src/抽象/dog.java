package 抽象;
//一个类如果继承了抽象类，那么这个类必须重写完抽象类的全部抽象方法，，否则这个类也必须定义成抽象类
public class dog extends Animal {
    @Override
    public void run() {
        System.out.println("fast");
    }
}
