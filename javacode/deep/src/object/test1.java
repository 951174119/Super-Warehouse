package object;

public class test1 {
    //public String toString()默认是返回当前对象在堆内存中的地址信息
    //让子类重写，以便返回子类对象的内容
    public static void main(String[] args) {
    student S1=new student("xiaoming",18,"nan");
    student S2=new student("xiaoming",18,"nan");
        System.out.println(S1.toString());
        System.out.println(S1);
        /**
         * equals默认是比较当前对象与另一个对象的地址是否相同
         * 父类equals方法存在的意义就是为了被子类重写，以便子类自己来定制比较规则
          */
        System.out.println(S1.equals(S2));

    }
}
