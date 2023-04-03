package 泛型;

import java.util.List;

/**
 * 泛型：是JDK5中引入的特性，可以在编译阶段约束操作的数据类型，并进行检查
 * 泛型的格式：<数据类型>;注意：泛型只能支持引用数据类型
 * 结合体系的全部接口和实现类都是支持泛型的使用的
 * 泛型的好处
 * 统一数据类型
 */
public class test {
    public static void main(String[] args) {
        MyArrayList<String> List1=new MyArrayList<>();
        List1.add("123");
        Integer[] arr={1,2,3,423,1,123};
        print(arr);
        StringBuilder sb=new StringBuilder("[");
    }
    public static <E> void print(E[] arr){
        if(arr!=null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ",");
            }
            sb.append("]");
            System.out.println(sb);
        }else{
            System.out.println(arr);
        }
    }
}



































