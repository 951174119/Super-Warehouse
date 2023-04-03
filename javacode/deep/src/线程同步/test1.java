package 线程同步;

import 线程安全.Account;
import 线程安全.User;

/**
 *线程同步：为了解决线程安全问题
 * 核心思想：加锁，把共享资源上锁，每次只能一个线程进入访问完毕以后解锁，然后其他线程才能进来
 * 方式一：同步代码块
 * 作用：把出现线程安全问题的核心代码上锁
 * 原理：每次只能一个线程进入，执行完毕后自动解锁，其他线程才可以进来执行
 * 理论上：锁对象只要对于当前同时执行的线程来说是同一个对象即可
 * 规范上：建议使用共享资源作为锁对象
 * 对于静态方法建议使用字节码（类名.class）对象作为锁对象（静态方法属于类）
 * 对于实例方法建议使用this作为锁对象
 */
public class test1 {
    public static void main(String[] args) {
        Account1 acc=new Account1("12345",1000);
        new User1(acc,"ming").start();
        new User1(acc,"hong").start();
    }
}























