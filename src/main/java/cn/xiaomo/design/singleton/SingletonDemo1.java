package cn.xiaomo.design.singleton;

/**
 * @author xiaomo
 */
public class SingletonDemo1 {

  private final static SingletonDemo1 INSTANCE = new SingletonDemo1();

  private SingletonDemo1() {
  }

  public static SingletonDemo1 getInstance() {
    return INSTANCE;
  }
}
