package 缓冲流;

import java.io.*;

/**
 * 缓冲字符输入流
 */
public class test2 {
    public static void main(String[] args) throws Exception {

        try (
                Reader f1 = new FileReader("deep\\src\\data");
                BufferedReader f2=new BufferedReader(f1);
                ) {
//            char[] ch = new char[1024];
//            int len;
//            while ((len = f2.read(ch)) != -1) {
//                System.out.println(new String(ch, 0, len));
            String line;
                while ((line=f2.readLine())!=null)
                {
                    System.out.println(line);
                }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        }
    }

