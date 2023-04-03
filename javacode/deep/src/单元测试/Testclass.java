package 单元测试;

import org.junit.Assert;
import org.junit.Test;

public class Testclass {
        //测试方法 1.必须是公开的，无参数，无返回值的方法 2.测试方法必须使用@Test注解标记
        @Test
        public void test(){
        test1 t1=new test1();
        String S=t1.name("admin","12345");
        //进行预期结果的正确性测试，断言
        Assert.assertEquals("errous","true",S);
    }
    @Test
    public void test2(){
        test1 t2=new test1();
        t2.state();
    }
}
