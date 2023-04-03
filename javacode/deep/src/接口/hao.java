package 接口;

public interface hao {
    default void hellow(){
        ni();
        System.out.println("hellow");
    }
    static void word(){
        System.out.println("word");
    }
    private void ni(){
        System.out.println("ni");
    }

    public static void main(String[] args) {

    }
}
