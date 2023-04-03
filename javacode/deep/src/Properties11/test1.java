package Properties11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**\
 * Properties可以保存键值对数据到属性文件
 */
public class test1 {
    public static void main(String[] args) throws Exception {
        Properties p1=new Properties();
        p1.setProperty("admin","123");
        p1.setProperty("admin1","1235");
        p1.setProperty("admin2","1234");
        System.out.println(p1);
        p1.store(new FileWriter("deep\\src\\data2.properties"),"hello");
        Properties p2=new Properties();
        p2.load(new FileReader("deep\\src\\data2.properties"));
        System.out.println(p2);
        System.out.println(p2.getProperty("admin"));
    }
}
