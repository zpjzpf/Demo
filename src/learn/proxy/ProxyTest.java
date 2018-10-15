package learn.proxy;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-05-02 10:59
 */
public class ProxyTest {
    public static void main(String[] args) {

        Sourceable source = new Proxy();
        source.method();
    }

}