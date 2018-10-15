package learn.learn.singleton.test;

import learn.Singleton;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-04-25 16:00
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton singelton = Singleton.getInstance();
        System.out.println(singelton.getT());

        Singleton singelton1 = Singleton.getInstance();
        singelton1.setT("我勒个去。。");
        System.out.println(singelton.getT());
        System.out.println(singelton1.getT());
    }
}