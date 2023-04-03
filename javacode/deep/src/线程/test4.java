package 线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 方式三：利用Callable、FutureTask接口实现
 * 优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强
 * 可以在线程执行完毕后去获取线程执行的结果
 * 缺点:编码复杂
 */
public class test4 {
    public static void main(String[] args) throws Exception {
        Callable<String> call=new Task(100);//任务对象
        //把Callable任务对象 交给FutureTast对象
        //FutureTast对象作用：
        //1.是Runnable对象（实现了Runnable接口），可以交给Thread
        //2.可以在线程执行完毕之后通过调用其get（）方法得到线程执行完成的结果
        FutureTask<String> f1=new FutureTask<>(call);
        Thread t1=new Thread(f1);
        t1.start();

        Callable<String> call2=new Task(200);//任务对象
        FutureTask<String> f2=new FutureTask<>(call2);
        Thread t2=new Thread(f2);
        t2.start();
        try {
            System.out.println(f1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(f2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Task implements Callable<String>{
    public Task(int n) {
        this.n = n;
    }

    private int n;

    @Override
    public String call() throws Exception {//线程的任务方法
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return ""+sum;
    }
}











