package 异常处理;

public class test4 {
    public static void main(String[] args) {
            checkAge(34);
    }
    public static void checkAge(int age) throws OneRuntimeException {
        if(age<0||age>200){
            //抛出异常
            //throw:在方法内部直接创建一个异常对象，并从此点抛出
            //throws：用在方法申明上的，抛出方法内部的异常
            throw new OneRuntimeException(age+"is illeagal");
        }else{
            System.out.println("true");
        }
    }
}
