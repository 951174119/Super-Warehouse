package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executors的工具类构建线程池对象
 */
public class test3 {
    public static void main(String[] args) {
        ExecutorService pool1= Executors.newFixedThreadPool(3);//创建固定线程数量的线程池
    }
}
