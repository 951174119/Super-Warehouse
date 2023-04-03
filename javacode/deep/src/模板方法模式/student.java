package 模板方法模式;

public abstract class student {
    //final可以防止子类修改模板,防止子类重写模板方法
    public final void write(){
        System.out.println("what is your name");
        name();
    }
    public abstract void name();
}
