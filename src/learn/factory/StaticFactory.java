package learn.factory;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-04-28 15:54
 */
public class StaticFactory {
    public FactoryInterface getClass1(){
        return new Class1();
    }

    public FactoryInterface getClass2(){
        return new Class2();
    }
}