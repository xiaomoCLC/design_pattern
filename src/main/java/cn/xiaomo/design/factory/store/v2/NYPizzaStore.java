package cn.xiaomo.design.factory.store.v2;

import cn.xiaomo.design.factory.pizza.Pizza;
import cn.xiaomo.design.factory.pizza.v2.NYCheesePizza;
import cn.xiaomo.design.factory.pizza.v2.NYClamPizza;
import cn.xiaomo.design.factory.pizza.v2.NYPepperoniPizza;
import cn.xiaomo.design.factory.pizza.v2.NYVeggiePizza;
import cn.xiaomo.design.factory.store.v2.PizzaStoreV2;

/**
 * @description
 * 
 **/
public class NYPizzaStore extends PizzaStoreV2 {

    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new NYClamPizza();
        } else if (pizzaType.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
