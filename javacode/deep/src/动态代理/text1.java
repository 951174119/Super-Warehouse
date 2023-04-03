package 动态代理;

/**
 * 代理指：某些场景下对象会找一个代理对象，来辅助自己完成一些工作，如：歌星（经纪人），买房的人（房产中介）
 * Proxy提供了一个静态方法，用于为对象产生一个代理对象返回
 */
public class text1 {
    public static void main(String[] args) {
        //创建一个类，对象的类必须实现接口
        start s=new start("xiaoming");
        skill s2=agent.getstart(s);
        s2.dance();
        s2.sing();
    }
}
