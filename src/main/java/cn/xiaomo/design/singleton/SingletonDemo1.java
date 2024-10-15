package cn.xiaomo.design.singleton;


/**
 * @author xiaomo
 * @date 2024-10-15
 * @description 饿汉式（线程安全，调用效率高，但是不能延时加载）
 */
public class SingletonDemo1 {

  private final static SingletonDemo1 INSTANCE = new SingletonDemo1();

  private SingletonDemo1() {}

  public static SingletonDemo1 getInstance() {
    return INSTANCE;
  }

}
