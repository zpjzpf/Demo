package learn;

/**
 * 描述:
 * 单例模式
 *
 * @ Author Zhangpj
 * @ Date 2018-04-25 15:54
 */
public class Singleton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance = null;
    private String t = "单例";

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 1:懒汉式，静态工程方法，创建实例 */
    public static Singleton getInstance() {
        if (instance == null) {
            instance =  new Singleton();
        }
        return instance;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }
}