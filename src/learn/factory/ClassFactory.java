package learn.factory;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-04-28 11:28
 */
public class ClassFactory {

    public FactoryInterface getClass(String className) throws  Exception{
        Class c = Class.forName("learn.factory.Class"+className);
        FactoryInterface obj = (FactoryInterface)c.newInstance();
        return obj;
     }
}