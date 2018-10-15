package learn.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-04-27 15:43
 */
public interface   AbstractSubject {
    List<Observer> list = new ArrayList<>();
    abstract void add(Observer observer);
  abstract void delete(Observer observer);
  abstract  void notifyAllObserver();
abstract void setMessage(String message);


}