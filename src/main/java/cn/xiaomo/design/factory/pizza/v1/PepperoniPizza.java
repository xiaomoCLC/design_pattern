package cn.xiaomo.design.factory.pizza.v1;

import cn.xiaomo.design.factory.pizza.Pizza;

/**
 *
 **/
public class PepperoniPizza implements Pizza {

  public void prepare() {
    System.out.println("PepperoniPizza prepare()");
  }

  public void bake() {
    System.out.println("PepperoniPizza bake()");
  }

  public void cut() {
    System.out.println("PepperoniPizza cut()");
  }

  public void box() {
    System.out.println("PepperoniPizza box()");
  }
}
