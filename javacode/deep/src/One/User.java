package One;

public class User {
    private String name;

    public static int onlineNumber=111;//静态成员变量，只在内存中有一份,可以被共享

    public static void main(String[] args) {
        User U=new User();
        System.out.println(U.name);
    }

}
