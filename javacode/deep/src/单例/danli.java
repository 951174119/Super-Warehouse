package 单例;

/**
 * 饿汉单例
 * 在用类获取对象的时候，对象已经提前为你创建好了
 */
public class danli {
        public static danli ehan=new danli();
        private danli(){
        }

}
