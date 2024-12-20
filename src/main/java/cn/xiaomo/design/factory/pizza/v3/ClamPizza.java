package cn.xiaomo.design.factory.pizza.v3;

import cn.xiaomo.design.factory.PizzaIngredientFactory;

/**
 *
 **/
public class ClamPizza extends Pizza {

  public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
    this.name = "ClamPizza";
  }

  /**
   * 蛤蜊披萨需要原料：面团、酱、干酪、蛤蜊
   */
  public void prepare() {
    System.out.println("ClamPizza prepare() include: dough、sauce、cheese、clams");
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    clams = pizzaIngredientFactory.createClams(); // 加入蛤蜊配料
  }
}
