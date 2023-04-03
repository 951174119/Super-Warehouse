package 异常处理;

/**
 * 自定义异常
 * 1.自定义编译时异常
 * 定义一个异常类继承Exception
 * 重写构造器
 * 在出现异常的地方用throw new 自定义对象抛出
 *
 */
public class test3 {
    public static void main(String[] args) {
        try {
            checkAge(34);
        } catch (OneException e) {
            e.printStackTrace();
        }
    }
    public static void checkAge(int age) throws OneException {
        if(age<0||age>200){
            //抛出异常
            //throw:在方法内部直接创建一个异常对象，并从此点抛出
            //throws：用在方法申明上的，抛出方法内部的异常
            throw new OneException(age+"is illeagal");
        }else{
            System.out.println("true");
        }
    }
}



















