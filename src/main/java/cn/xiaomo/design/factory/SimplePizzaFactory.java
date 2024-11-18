package cn.xiaomo.design.factory;

import cn.xiaomo.design.factory.pizza.Pizza;
import cn.xiaomo.design.factory.pizza.v1.CheesePizza;
import cn.xiaomo.design.factory.pizza.v1.ClamPizza;
import cn.xiaomo.design.factory.pizza.v1.PepperoniPizza;
import cn.xiaomo.design.factory.pizza.v1.VeggiePizza;

/**
 *
 **/
public class SimplePizzaFactory {

  public Pizza createPizza(String pizzaType) {
    Pizza pizza = null;
    if (pizzaType.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (pizzaType.equals("pepperoni")) {
      pizza = new PepperoniPizza();
    } else if (pizzaType.equals("clam")) {
      pizza = new ClamPizza();
    } else if (pizzaType.equals("veggie")) {
      pizza = new VeggiePizza();
    }
    return pizza;
  }
}
