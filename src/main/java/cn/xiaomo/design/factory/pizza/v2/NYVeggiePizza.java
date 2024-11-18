package cn.xiaomo.design.factory.pizza.v2;

import cn.xiaomo.design.factory.pizza.Pizza;

/**
 *
 **/
public class NYVeggiePizza implements Pizza {

  public void prepare() {
    System.out.println("NYVeggiePizza prepare()");
  }

  public void bake() {
    System.out.println("NYVeggiePizza bake()");
  }

  public void cut() {
    System.out.println("NYVeggiePizza cut()");
  }

  public void box() {
    System.out.println("NYVeggiePizza box()");
  }
}
