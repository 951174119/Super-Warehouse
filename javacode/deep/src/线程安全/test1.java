package 线程安全;

/**
 * 多个线程同时操作同一个共享资源的时候可能会出现业务安全问题，称为线程安全问题
 * 原因：多个线程同时访问同一个共享资源且存在修改该资源
 */
public class test1 {
    public static void main(String[] args) {
        Account acc=new Account("12345",1000);
        new User(acc,"ming").start();
        new User(acc,"hong").start();
    }
}
