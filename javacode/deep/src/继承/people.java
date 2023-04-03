package 继承;

/**
 * 父类
 */
public class people {
    private String name;
    private int age;
    public String work ="laoshi";
    public people(){
        System.out.println("wucanshufulei");
    }
    public people(String name){
        this(name,18);//若只输入名字，默认年龄18
    }
    public people(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(){
        System.out.println("人会跑");
    }
}
