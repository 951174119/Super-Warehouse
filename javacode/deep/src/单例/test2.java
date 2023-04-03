package 单例;

public class test2 {
    public static void main(String[] args) {
        danli2 D1=danli2.getLanhan();
        danli2 D2=danli2.getLanhan();
        System.out.println(D1);
        System.out.println(D2);
        System.out.println(D2==D1);
    }
}
