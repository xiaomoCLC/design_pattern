package cn.xiaomo.design.strategy.duck;

import cn.xiaomo.design.strategy.fly.FlyWithWings;
import cn.xiaomo.design.strategy.quack.GuaGua;

/**
 *
 **/
public class RedheadDuck extends Duck {

  public RedheadDuck() {
    flyBehavior = new FlyWithWings(); // 鸭子飞行
    quackBehavior = new GuaGua(); // 呱呱叫
  }

  public void display() {
    System.out.println("红头鸭的外貌特征");
  }
}
