package 接口;

/**
 * 1.接口不能创建对象
 * 2.一个类实现多个接口，多个接口中有同样的静态方法不冲突
 * 3.一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的
 * 4.一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可
 * 5.一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承
 */
public interface test {
    //目标：接口中的成分特点，JDK 8之前接口中只能有抽象方法和常量
    //1.常量
    public static final String SHCOOL="yizhong";//public static final可以省略不写,常量一定要进行初始化
    //2.抽象方法
    public abstract void run();
    public abstract void eat();
    //注意：由于接口体现规范思想，规范默认都是公开的，所以public abstract可以省略不写
    void write();//public abstract void write();
}
