package cn.xiaomo.design.factory.store.v3;

import cn.xiaomo.design.factory.NYPizzaingredientFactory;
import cn.xiaomo.design.factory.PizzaIngredientFactory;
import cn.xiaomo.design.factory.pizza.v3.*;

/**
 * @description
 * 
 **/
public class NYPizzaStore extends PizzaStoreV3 {

    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaingredientFactory(); // 纽约口味配料工厂
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
        } else if (pizzaType.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
