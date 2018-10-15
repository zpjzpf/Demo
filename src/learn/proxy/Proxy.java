package learn.proxy;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-05-02 10:57
 */
public class Proxy implements  Sourceable {

    private Source source;
    @Override
    public void method() {

        source = new Source();
        this.before();
        source.method();
        this.after();
    }
    private void before(){
        System.out.println("Before");
    }
    private void after(){
        System.out.println("After");
    }
}