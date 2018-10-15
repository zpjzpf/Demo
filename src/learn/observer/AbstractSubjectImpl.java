package learn.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-04-27 16:47
 */
public class AbstractSubjectImpl implements AbstractSubject {

    String message;

    @Override
    public void add(Observer observer){
        list.add(observer);
    }




    public void delete(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllObserver(){

        for (int i = 0; i <list.size(); i++) {
            list.get(i).update(null,message);
        }
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        notifyAllObserver();
    }
}