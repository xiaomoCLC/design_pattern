package cn.xiaomo.design.strategy.quack;

/**
 *
 **/
public class MuteQuack implements QuackBehavior {

  public void quack() {
    System.out.println("不会叫");
  }
}
