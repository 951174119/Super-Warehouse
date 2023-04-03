package Logback;

import org.slf4j.LoggerFactory;

/**
 * 日志级别
 * 级别程度依次是：TRACE<DEBUG<INFO<WARN<ERROR;默认级别是DEBUG（忽略大小写），对应其方法
 * 作用：用于控制系统中哪些日志级别是可以输出的，只输出级别不低于设定级别的日志信息
 * ALL和OFF分别是打开全部日志信息，及关闭全部日志信息
 * 具体在<root level="INFO">标签的level属性中设置日志级别
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 目标：快捷搭建LogBack日志框架 记录程序的执行情况到控制台 到文件中
 */
public class test1 {
    //创建LogBack的日志对象，代表了日志技术
    public static final Logger LOGGER= LoggerFactory.getLogger("test1.class");
    public static void main(String[] args) {
        LOGGER.debug("true");
        LOGGER.info("two");
        int a=10;
        int b=0;
        LOGGER.trace("a="+a);
        LOGGER.trace("b="+b);
    }
}


























