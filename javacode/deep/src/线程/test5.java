package 线程;

/**
 * 线程常用方法
 */
public class test5 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new MyThread();
        t1.start();
        //t1.setName("1");//设置线程名称
        Thread t2=new MyThread();
        t2.start();
        //t2.setName("2");
        Thread t3=Thread.currentThread();//获取执行此语句的线程对象
        System.out.println("t1:"+t1.getName());
        System.out.println("t2:"+t2.getName());
        System.out.println("t3:"+t3.getName());//获取线程的默认名字
        //线程的休眠方法
        //让当前线程休眠指定时间后再继续执行，单位为毫秒
        Thread.sleep(10000);
        System.out.println("11");
    }
}











