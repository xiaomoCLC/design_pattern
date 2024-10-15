package cn.xiaomo.design.singleton;

/**
 * @author xiaomo
 * @date 2024-10-15
 * @description 枚举类
 */
public enum SingletonDemo5 {

  // 枚举元素本身就是单例
  INSTANCE;

  // 添加自己需要的操作，直接通过 SingletonDemo5.INSTANCE.doSomething() 方法调用即可
  public void doSomething(){
    System.out.println("doSomething...");
  }
}
