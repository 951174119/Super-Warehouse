package 动态代理;

public class start implements skill{
    private String name;

    public start(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println("good");
    }

    @Override
    public void sing() {
        System.out.println("sing good");
    }
}
