package One;

public class dongtai {
    public dongtai(){
        System.out.println("wucan");
    }
    {
        System.out.println("-------shili--------");
    }//每次创建对象，调用构造器执行时，都会执行该代码块中的代码，并且再构造器执行前执行

    public static void main(String[] args) {
        dongtai A=new dongtai();
        dongtai A2=new dongtai();
    }
}
