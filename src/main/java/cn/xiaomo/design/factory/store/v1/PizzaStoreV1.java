package cn.xiaomo.design.factory.store.v1;

import cn.xiaomo.design.factory.SimplePizzaFactory;
import cn.xiaomo.design.factory.pizza.Pizza;

/**
 *
 **/
public class PizzaStoreV1 {

  private SimplePizzaFactory factory;

  public PizzaStoreV1(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String pizzaType) {
    Pizza pizza = factory.createPizza(pizzaType);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
