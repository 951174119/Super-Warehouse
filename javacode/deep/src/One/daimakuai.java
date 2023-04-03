package One;

public class daimakuai {
    public static String name;
    /**
     * 静态代码块：有static修饰，属于类，与类一起优先加载一次，自动触发执行
     */
    static {
        System.out.println("--------jiangtaidaimakuai--------");
        name = "jiatianle";
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(name);
        daimakuai D=new daimakuai();
        System.out.println(D.name);
    }
}
