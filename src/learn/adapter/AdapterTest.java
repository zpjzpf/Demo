package learn.adapter;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-05-02 9:29
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}