package 异常处理;

/**
 * 自定义运行时异常
 * 定义一个异常类继承RuntimeException
 * 重写构造器
 * 在出现异常的地方用throw new 自定义对象抛出
 * 作用：提醒不强烈，编译阶段不报错，运行时才可能出现
 */
public class OneRuntimeException extends RuntimeException{
    public OneRuntimeException() {
    }

    public OneRuntimeException(String message) {
        super(message);
    }
}


















