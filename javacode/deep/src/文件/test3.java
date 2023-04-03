package 文件;

public class test3 {
    public static void main(String[] args) {
        System.out.println(jiecheng(5));
        System.out.println(beach(1));
    }
    public static int jiecheng(int n){
        if(n==2) return 2;
        else return n*jiecheng(n-1);
    }
    public static int beach(int n){
        if(n==10) return 1;
        else return 2*(beach(n+1)+1);
    }
}
