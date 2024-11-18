package cn.xiaomo.design.strategy.duck;

import cn.xiaomo.design.strategy.fly.FlyNoWay;
import cn.xiaomo.design.strategy.quack.MuteQuack;

/**
 *
 **/
public class DecoyDuck extends Duck {

  public DecoyDuck() {
    flyBehavior = new FlyNoWay(); // 不会飞
    quackBehavior = new MuteQuack(); // 假鸭，不会叫
  }

  public void display() {
    System.out.println("假鸭的外貌特征");
  }
}
