package 单元测试;

import org.junit.Test;

/**
 * 单元测试就是针对最小的功能单元编写测试代码，java程序最小的功能单元是方法，因此，单元测试就是针对Java方法的测试，进而检查方法的正确性
 * JUnitd单元测试框架
 * JUnit是使用Java语言实现的单元测试框架，它是开源的，Java开发者都应当学习并使用JUnit编写单元测试
 * 优点：
 * 可以灵活的选择执行哪些测试方法，可以一键执行全部测试方法
 * JUnit可以生成全部方法的测试报告
 */
public class test1 {
    public String  name(String login,String pass){
        if("admin".equals(login)&&"12345".equals(pass)){
            return "true";
        }else return "false";
    }

    public void state(){
        System.out.println(10/0);
    }
}





























