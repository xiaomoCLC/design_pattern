package cn.xiaomo.design.strategy;

import cn.xiaomo.design.strategy.duck.Duck;
import cn.xiaomo.design.strategy.duck.RubberDuck;
import cn.xiaomo.design.strategy.fly.FlyWithWings;

/**
 *
 */
public class StrategyTest {

  public static void main(String[] args) {
    // 生成橡皮鸭
    Duck rubberDuck = new RubberDuck();
    rubberDuck.display();
    rubberDuck.fly();
    System.out.println("-----------对橡皮鸭进行改造，让它能飞起来------------");
    rubberDuck.setFlyBehavior(new FlyWithWings()); // 更换会飞的算法族
    rubberDuck.fly();
  }
}
