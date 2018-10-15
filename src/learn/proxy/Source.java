package learn.proxy;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-05-02 10:53
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("输出指令Source!!!");
    }
}