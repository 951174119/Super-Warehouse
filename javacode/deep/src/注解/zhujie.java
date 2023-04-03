package 注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})//元注解,这里约束只能注解方法和成员变量
public @interface zhujie {
}
