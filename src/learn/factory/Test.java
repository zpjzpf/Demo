package learn.factory;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-04-28 15:31
 */
public class Test {

    public static void main(String[] args) throws Exception {

        ClassFactory factory = new ClassFactory();
        FactoryInterface in = factory.getClass("1");
        in.print();
    }
}