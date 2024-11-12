package cn.xiaomo.design.factory.store.v2;

import cn.xiaomo.design.factory.pizza.Pizza;
import cn.xiaomo.design.factory.pizza.v2.ChicagoCheesePizza;
import cn.xiaomo.design.factory.pizza.v2.ChicagoClamPizza;
import cn.xiaomo.design.factory.pizza.v2.ChicagoPepperoniPizza;
import cn.xiaomo.design.factory.pizza.v2.ChicagoVeggiePizza;

/**
 * @description
 * 
 **/
public class ChicagoPizzaStore extends PizzaStoreV2 {

    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new ChicagoClamPizza();
        } else if (pizzaType.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }
        return pizza;
    }
}
