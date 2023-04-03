package 线程池;

import java.util.concurrent.*;

/**
 * 线程池处理Callable任务
 */
public class test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool=new ThreadPoolExecutor(3,5,3, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Future<String> f1=pool.submit(new Task(100));
        Future<String> f2=pool.submit(new Task(400));
        Future<String> f3=pool.submit(new Task(300));
        Future<String> f4=pool.submit(new Task(200));
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
