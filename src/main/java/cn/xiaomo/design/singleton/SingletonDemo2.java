package cn.xiaomo.design.singleton;

/**
 * @author xiaomo
 */
public class SingletonDemo2 {

  // 初始化时，不初始化这个对象（延迟加载，真正使用时再创建）
  private static SingletonDemo2 instance;

  private SingletonDemo2() {
  }

  // 方法同步，调用效率低
  public static synchronized SingletonDemo2 getInstance() {
    if (instance == null) {
      instance = new SingletonDemo2();
    }
    return instance;
  }
}
