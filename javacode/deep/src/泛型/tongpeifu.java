package 泛型;

import java.util.ArrayList;

/**
 * ?可以在“使用泛型”的时候代表一切类型
 * ? extents Car:?必须是Car或者其子类 泛型上限
 * ? super Car:?必须是Car或者其父类 泛型下限
 */
public class tongpeifu {
    public static void main(String[] args) {

    }
    public static void go(ArrayList<? extends car> cars){

    }
}
class car{

}
class Baoma{

}
class Benchi{

}
