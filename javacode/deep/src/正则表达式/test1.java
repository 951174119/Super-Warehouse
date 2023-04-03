package 正则表达式;

/**
 * 正则表达式可以用一些规定的字符来制定规则，并用来校验数据格式的合法性
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("1234324qq"));
        System.out.println(checkQQ("1234324"));
    }
    public static boolean checkQQ2(String qq){
        return qq!=null&&qq.matches("\\d{6,20}");
    }
    public static boolean checkQQ(String qq){
        //判断长度
        if(qq==null||qq.length()>20) return false;
        //判断qq种是否全是数字
        for (int i = 0; i < qq.length(); i++) {
            char ch=qq.charAt(i);
            if(ch<'0'||ch>'9') return false;
        }
        return true;
    }
}
