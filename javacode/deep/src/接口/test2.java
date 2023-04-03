package 接口;
//接口和接口的关系：多继承，一个接口可以同时继承多个接口
public class test2 implements xin{
    @Override
    public void run1() {

    }

    @Override
    public void read() {

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
    public void acc() {
        System.out.println("中国");
    }

    public static void main(String[] args) {
        System.out.println(xin.SHCOOL);
        test2 T=new test2();
        T.acc();
    }
}
