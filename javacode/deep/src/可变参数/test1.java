package 可变参数;

/**
 * 可变参数用在形参中可以接收多个数据
 * 可变参数的格式：数据类型...参数名称
 * 一个形参列表中可变参数只能有一个
 * 可变参数必须放在形参列表的最后面
 */
public class test1 {
    public static void main(String[] args) {
        //不传参数
        sum();
        //一个参数
        sum(14);
        //多个参数
        sum(12,34,234);
        //数组类型
        sum(new int[]{123,324,234,123});
    }
    public static void sum(int...nums){
        //可变参数在方法内部就是一个数组

    }
}
