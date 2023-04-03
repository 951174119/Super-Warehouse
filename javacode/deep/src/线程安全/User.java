package 线程安全;

public class User extends Thread{
    public Account acc;
    public User(Account acc,String name){
        super(name);//调用父类构造器
        this.acc=acc;
    }

    @Override
    public void run() {
        acc.draw(1000);
    }
}
