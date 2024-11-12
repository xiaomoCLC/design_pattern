package cn.xiaomo.design.factory.store.v2;

import cn.xiaomo.design.factory.pizza.Pizza;

/**
 * @description
 * 
 **/
public abstract class PizzaStoreV2 {

    protected abstract Pizza createPizza(String pizzaType);

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
