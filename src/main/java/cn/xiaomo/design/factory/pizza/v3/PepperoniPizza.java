package cn.xiaomo.design.factory.pizza.v3;

import cn.xiaomo.design.factory.PizzaIngredientFactory;

/**
 *
 **/
public class PepperoniPizza extends Pizza {

  public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
    this.name = "PepperoniPizza";
  }

  /**
   * 意大利辣肉肠口味披萨需要原料：面团、酱、干酪、蛤蜊
   */
  public void prepare() {
    System.out.println("PepperoniPizza prepare() include: dough、sauce");
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
  }
}
