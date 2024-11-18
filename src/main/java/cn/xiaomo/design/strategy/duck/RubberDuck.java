package cn.xiaomo.design.strategy.duck;

import cn.xiaomo.design.strategy.fly.FlyNoWay;
import cn.xiaomo.design.strategy.quack.Squeak;

/**
 *
 **/
public class RubberDuck extends Duck {

  public RubberDuck() {
    flyBehavior = new FlyNoWay(); // 不会飞
    quackBehavior = new Squeak(); // 吱吱叫
  }

  public void display() {
    System.out.println("橡胶鸭的外貌特征");
  }
}
