package cn.xiaomo.design.singleton;

/**
 * @author xiaomo
 */
public class SingletonDemo3 {

  private volatile static SingletonDemo3 singletonDemo3;

  private SingletonDemo3() {
  }

  public static SingletonDemo3 newInstance() {
    if (singletonDemo3 == null) {
      synchronized (SingletonDemo3.class) {
        if (singletonDemo3 == null) {
          singletonDemo3 = new SingletonDemo3();
        }
      }
    }
    return singletonDemo3;
  }
}
