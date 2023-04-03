package 正则表达式;

import java.util.Scanner;
import java.util.SplittableRandom;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(A.matches("\\d{3,5}"));//数字
        System.out.println(A.matches("\\W{2}"));//非字母
        System.out.println(A.matches("\\W?"));//非数字非英文非下划线
        System.out.println(A.matches("\\w?"));//数字英文下划线
        //按照正则表达式匹配的内容进行替换
        String name = "as123++swdkf1324++zsrfdHGUJ";
        String name3 = name.replaceAll("\\W+", "  ");
        System.out.println(name3);
        //按照正则表达式匹配的内容进行分隔
        String[] name2 = name.split("\\W+");
        System.out.println(name2[1]);
    }
}
