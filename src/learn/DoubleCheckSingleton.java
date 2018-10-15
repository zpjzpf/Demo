package learn;

/**
 * 描述:
 * 双重检查
 *
 * @ Author Zhangpj
 * @ Date 2018-04-26 9:33
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton  instance = null;

    public static DoubleCheckSingleton getInstance() {

        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    int a = 1; //1
                    int b = 2; //2
                    int c = a+b;//3
                    instance = new DoubleCheckSingleton();
                }

            }


        }
        return instance;
    }
}