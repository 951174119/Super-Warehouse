package 缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 缓冲字符输出流
 * newline()自动换行==write("\r\n")
 */
public class test3 {
    public static void main(String[] args) throws Exception {
        Writer fw=new FileWriter("deep\\src\\data1.txt",true);//覆盖写，加true后为追加写
        BufferedWriter fw2=new BufferedWriter(fw);
        fw2.newLine();
        fw2.write('a');

        //fw.write("\r\n");
        fw2.write("你好".toCharArray());
        fw2.write("abc你好啊",0,2);
        fw2.flush();//刷新
        fw2.close();//包含刷新
    }
}
