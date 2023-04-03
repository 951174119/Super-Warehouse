package 线程;

/**
 * 方式二：实现Runnable接口
 * 优点：线程任务类知识实现接口，可以继续继承类和实现接口，扩展性强
 * 缺点：编程多一层对象包装，如果线程有执行结果是不可以直接返回的
 */
public class test2 {
    public static void main(String[] args) {
        Runnable mr=new Myrunnable();//任务对象
        Thread t1=new Thread(mr);//把任务对象交给Thread处理
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(2);
        }
    }
}
class Myrunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(1);
        }
    }
}


















