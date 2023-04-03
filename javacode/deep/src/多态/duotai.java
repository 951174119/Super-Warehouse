package 多态;
/**
 * 多态：同类型的对象，执行同一个行为，会表现出不同的行为特征
 * 方法调用：编译看左边，运行看右边
 * 变量调用：都看左边（多态侧重行为多态）
 */
public class duotai {
    public static void main(String[] args) {
        annimals D=new dogs();
        annimals C=new cats();
        D.run();
        C.run();
        D.name="asdf";
        System.out.println(D.name);
        System.out.println(C.name);
        System.out.println(D instanceof dogs);
        System.out.println(D instanceof annimals);
        System.out.println(D instanceof cats);
        dogs T=(dogs) D;//强制类型转换,转换后可以调用子类独有方法
    }
}
