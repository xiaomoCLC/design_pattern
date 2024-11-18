package cn.xiaomo.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 **/
public class SubjectImpl implements Subject {

  private List<Observer> observers; // 观察者集合

  public SubjectImpl() {
    this.observers = new ArrayList<>();
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObserver() {
    observers.forEach(observer -> observer.update());
  }
}
