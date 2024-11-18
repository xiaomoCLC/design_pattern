package cn.xiaomo.design.observer;

/**
 *
 */
public class OberverTest {

  public static void main(String[] args) {
    // 创建3个观察者
    Observer observer1 = new Observer1();
    Observer observer2 = new Observer2();
    Observer observer3 = new Observer3();
    // 创建主题
    SubjectImpl subject = new SubjectImpl();
    // 向主题中注册三个观察者
    subject.registerObserver(observer1);
    subject.registerObserver(observer2);
    subject.registerObserver(observer3);
    // 向所有观察者发送通知
    System.out.println("----------给observer1、observer2、observer3发通知----------");
    subject.notifyObserver();
    // 移除1个观察者observer2
    subject.removeObserver(observer2);
    System.out.println("----------移除了observer2之后发通知----------");
    // 向所有观察者发送通知
    subject.notifyObserver();
  }
}
