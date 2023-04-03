package 线程同步;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account2 {
    //final修饰后锁是唯一不可替换的
    public final Lock lock=new ReentrantLock();
    public String getID() {
        return ID;
    }
    public static void run(){
        synchronized (Account2.class){

        }
    }


    public void setID(String ID) {
        this.ID = ID;
    }

    public double getAcc() {
        return money;
    }

    public void setAcc(double acc) {
        this.money = acc;
    }

    private String ID;

    public Account2(String ID, double money) {
        this.ID = ID;
        this.money = money;
    }

    public Account2() {
    }

    public Account2(double acc) {
        this.money = acc;
    }

    private double money;
    public void draw(double money){
        String name =Thread.currentThread().getName();
        synchronized (this) {
            //lock.lock();//上锁
            if(this.money>=money){
                System.out.println("1000");
                this.money-=money;
                System.out.println(this.money);
            }
            else System.out.println("false");
            //lock.unlock();//解锁，一般放在try-catch-final中的finally语句里面
        }

    }


}

