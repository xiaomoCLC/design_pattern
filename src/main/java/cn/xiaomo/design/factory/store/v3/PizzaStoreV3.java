package cn.xiaomo.design.factory.store.v3;

import cn.xiaomo.design.factory.pizza.v3.Pizza;

/**
 *
 **/
public abstract class PizzaStoreV3 {

  /**
   * 创建pizza下移到子类中去实现
   */
  protected abstract Pizza createPizza(String pizzaType);

  /**
   * 创建披萨的过程是固定的，所以在抽象类中实现
   */
  public Pizza orderPizza(String pizzaType) {
    Pizza pizza = createPizza(pizzaType);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
