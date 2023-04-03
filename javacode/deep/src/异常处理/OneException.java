package 异常处理;

/**
 * 自定义的编译时异常
 * 1.继承Exception
 * 2.重写构造器
 */
public class OneException extends Exception{

    public OneException() {
    }

    public OneException(String message) {
        super(message);
    }
}






















