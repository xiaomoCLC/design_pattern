package cn.xiaomo.design.observer;

/**
 *
 **/
public interface Subject {

  /**
   * 注册观察者
   */
  void registerObserver(Observer observer);

  /**
   * 移除观察者
   */
  void removeObserver(Observer observer);

  /**
   * 执行观察者通知操作
   */
  void notifyObserver();
}
