package IO流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class test11 {
    public static void main(String[] args) throws Exception {
        Writer fw=new FileWriter("deep\\src\\data1.txt",true);//覆盖写，加true后为追加写
        fw.write(34);
        fw.write('a');
        fw.write("你好");
        fw.write("\r\n");
        fw.write("你好".toCharArray());
        fw.write("abc你好啊",0,2);
        fw.flush();//刷新
        fw.close();//包含刷新
    }
}
