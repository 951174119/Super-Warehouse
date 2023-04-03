package 线程;

/**
 *多线程的创建方法一：继承Thread类实现
 * 优点：编码简单
 * 缺点：线程类已经继承Thread，无法继承其他类，不利于扩展
 * 如果直接调用run会被当成方法在主线程调用，就不是多线程了
 * 要把子线程放到主线程之后
 */
public class test1 {
    public static void main(String[] args) {//主线程
        //new一个新线程对象
        Thread t=new MyThread();//子线程
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(2);
        }
    }
}

//定义一个线程类继承Thread类
class MyThread extends Thread{
    //重写run方法，里面是定义线程以后要干嘛

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(1);
        }
    }
}



















