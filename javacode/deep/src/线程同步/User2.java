package 线程同步;

public class User2 extends Thread {
    public Account2 acc;

    public User2(Account2 acc, String name) {
        super(name);//调用父类构造器
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.draw(1000);
    }
}