package learn.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-04-27 15:12
 */
public class Observer1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer1    收到咯！！！"+arg.toString());
    }
}