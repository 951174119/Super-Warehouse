package 单例;

/**
 * 懒汉单例
 * 在真正需要该对象的时候，才去创建一个对象
 */
public class danli2 {
    private static danli2 lanhan;
    private danli2(){};
    public static danli2 getLanhan(){
        if(lanhan==null)
            lanhan=new danli2();
        return lanhan;
    }

}
