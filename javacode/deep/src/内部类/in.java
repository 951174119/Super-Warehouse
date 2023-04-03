package 内部类;

/**
 * 内部类就是定义在一个类里面的类，里面的类可以理解成寄生，外部类可以理解成宿主
 */
public class in {
    private int age=18;
    //静态内部类
    public static class inter{
        private String name;
        public void show(){
            System.out.println();
        }
    }
    //成员内部类,不能加static修饰
    public class I1{
        private int age=20;
        public void show(){
            int age=22;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(in.this.age);
        }
    }//in.I1 I=new in().new I1();
    //局部内部类，几乎没用

}
