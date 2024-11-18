package cn.xiaomo.design.factory.pizza.v1;

import cn.xiaomo.design.factory.pizza.Pizza;

/**
 *
 **/
public class ClamPizza implements Pizza {

  public void prepare() {
    System.out.println("ClamPizza prepare()");
  }

  public void bake() {
    System.out.println("ClamPizza bake()");
  }

  public void cut() {
    System.out.println("ClamPizza cut()");
  }

  public void box() {
    System.out.println("ClamPizza box()");
  }
}
