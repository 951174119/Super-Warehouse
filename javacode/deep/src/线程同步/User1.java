package 线程同步;



public class User1 extends Thread{
    public Account1 acc;
    public User1(Account1 acc, String name){
        super(name);//调用父类构造器
        this.acc=acc;
    }

    @Override
    public void run() {
        acc.draw(1000);
    }
}
