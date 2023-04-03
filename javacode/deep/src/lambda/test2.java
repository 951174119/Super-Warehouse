package lambda;

public class test2 {
    public static void main(String[] args) {
        //Lambda只能简化接口中只有一个抽象方法的匿名内部类形式
        Swimming S=() ->{
            System.out.println("111");
        };
        S.swim();
        go(S);
//            @Override
//            public void swim() {
//                System.out.println("1111");
//            }
    }
    public static void go(Swimming s){
        s.swim();
    }
}
@FunctionalInterface//一旦加上这个注释必须是函数式接口，里面只能有一个抽象方法
interface Swimming{
    void swim();
}


















