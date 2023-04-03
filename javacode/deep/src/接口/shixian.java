package 接口;
//接口是用来被类实现的，实现接口的类称为实现类，实现类可以理解成所谓的子类
//接口可以被类单实现，也可以被类多实现
public class shixian implements sport,test{
    private String name;

    public shixian(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void write() {

    }

    @Override
    public void run1() {

    }

    @Override
    public void read() {

    }
}
