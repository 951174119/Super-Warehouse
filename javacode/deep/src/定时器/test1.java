package 定时器;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 定时器是一种控制任务延时调用，或者周期调用的技术
 * 作用：闹钟、定时邮件发送
 * 方式一：Timer
 * Timer是单线程，处理多个任务按照顺序执行，存在延时与设置定时器的时间有出入
 * 可能因为其中的某个任务的异常使Timer线程死掉，从而影响后续任务执行
 * 方式二：ScheduledExecutorService
 * 基于线程池，某个任务的执行情况不会影响其他定时任务的执行
 */
public class test1 {
    public static void main(String[] args) {
//        //创建Timer定时器
//        Timer t1=new Timer();
//        //调用方法，处理定时任务
//        t1.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        },3000,2000);//第一次执行等3秒，以后每次执行的时间间隔为2秒


        //创建ScheduledExecutorService线程池，做定时器
        ScheduledExecutorService pool1= Executors.newScheduledThreadPool(3);
        //开始定时任务
        pool1.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        },0,2, TimeUnit.SECONDS);
    }
}
