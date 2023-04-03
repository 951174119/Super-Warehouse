package 继承;

/**
 * 子类
 * 子类可以继承父类的属性和行为，但是子类不能继承父类的构造器
 * Java是单继承模式：一个类只能继承一个直接父类
 * Java不支持多继承，但是支持多层继承
 * Java中所有的类都是Object类的子类
 * 子类可以继承父类的私有成员，但不能直接访问，在内存中是显示继承的
 * 成员方法的访问遵循就近原则
 */
public class student extends people{
        public void write(){
            System.out.println("正在写");
        }
        public String work="xuesheng";
        public void showwork(){
            System.out.println(this.work);
            System.out.println(super.work);
        }

    public static void main(String[] args) {
        student S1=new student();
        S1.showwork();
        student S2=new student("xiaoming",18);
        System.out.println(S2.getName());
        System.out.println(S2.getAge());
    }
    public student(){
            //super();写不写都有
        System.out.println("wucanshuzilei");
    }//调用子类构造器时会先调用父类构造器
    public student(String name,int age){
            super(name,age);
    }

}
