package 线程;

/**
 *匿名内部类实现方式二
 */
public class test3 {
    public static void main(String[] args) {
        Runnable mr=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(1);
                }
            }
        };
        Thread t1=new Thread(mr);//把任务对象交给Thread处理
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(2);
        }
    }
}
