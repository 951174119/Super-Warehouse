package 线程同步;

/**
 * 方式二：同步方法
 * 作用：把出现线程安全问题的核心方法给上锁
 * 原理：每次只能一个线程进入，执行完毕以后自动解锁，其他线程才可以进来执行
 * 同步方法其实底层也是有隐式锁对象的，只是锁的范围是整个方法代码
 * 如果方法是实例方法：同步方法默认用this作为的锁对象，但是代码要高度面向对象
 * 如果方法是静态方法：同步方法默认用类名.class作为锁的对象
 */
public class test2 {
    public static void main(String[] args) {
        Account2 acc=new Account2("12345",1000);
        new User2(acc,"ming").start();
        new User2(acc,"hong").start();
    }
}
