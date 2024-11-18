package cn.xiaomo.design.strategy.duck;

import cn.xiaomo.design.strategy.fly.FlyWithWings;
import cn.xiaomo.design.strategy.quack.GuaGua;

/**
 *
 **/
public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehavior = new FlyWithWings(); // 鸭子飞行
    quackBehavior = new GuaGua(); // 呱呱叫
  }

  public void display() {
    System.out.println("野鸭的外貌特征");
  }
}
