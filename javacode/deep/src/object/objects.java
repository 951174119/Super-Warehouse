package object;

import java.util.Objects;

/**
 * Object类与Object还是继承关系
 * Object.equals比equals更安全(主要是空值的比较)
 * isNull判断变量是否为null，是则返回true,与==null相同
 */
public class objects {
    public static void main(String[] args) {
        String S1=null;
        String S2=new String("nihao");
        String S3="nihao";
        //System.out.println(S1.equals(S2));出错
        System.out.println(Objects.equals(S1, S2));
        System.out.println(Objects.equals(S3, S2));
        System.out.println("----------------------");
        System.out.println(Objects.isNull(S1));
        System.out.println(S1 == null);
    }
}
