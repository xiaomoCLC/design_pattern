package cn.xiaomo.design.strategy.duck;

import cn.xiaomo.design.strategy.fly.FlyBehavior;
import cn.xiaomo.design.strategy.quack.QuackBehavior;

/**
 *
 **/
public abstract class Duck {

  protected FlyBehavior flyBehavior; // 飞行行为
  protected QuackBehavior quackBehavior; // 叫声行为

  public abstract void display();

  public void swin() {
    System.out.println("鸭子游泳");
  }

  public void quack() {
    quackBehavior.quack();
  }

  public void fly() {
    flyBehavior.fly();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
