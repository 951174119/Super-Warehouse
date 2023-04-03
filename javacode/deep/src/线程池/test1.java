package 线程池;

import java.util.concurrent.*;

/**
 * 线程池就是一个可以复用线程的技术
 * 不用线程池的问题：如果用户每发起一个请求，后台就创建一个新线程来处理，下次新任务来了又要创建新线程，
 * 而创建新线程的开销是很大的，这样会严重影响系统的性能
 * 代表线程池的接口：ExecutorService
 * ThreadPoolExecutor构造器的参数说明
 * 1.指定线程池的线程数量（核心线程）：corePoolSize （不能小于0）
 * 2.指定线程池可支持的最大线程数：maximumPoolSize （最大数量>=核心线程数量）
 * 3.指定临时线程的最大存活时间：keepAliveTime （不能小于0）
 * 4.指定存活时间的单位（秒、分、时、天）：unit （时间单位）
 * 5.指定任务队列：workQueue （不能为null）
 * 6.指定用哪个线程工厂创建线程：threadFactory （不能为null）
 * 7.指定线程忙，任务满的时候，新任务来了怎么办：handler （不能为null）
 */
public class test1 {
    //线程池处理Runnable任务
    public static void main(String[] args) {
        //自定义线程池对象
        //1.创建线程池对象
        ExecutorService pool=new ThreadPoolExecutor(3,5,3, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //2.给任务线程池处理
        Runnable task=new Run();
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        //pool.shutdown();//会等待全部任务执行完毕之后再关闭
        //pool.shutdownNow();//立即关闭，即使任务没有完成，丢失任务
    }
}





















