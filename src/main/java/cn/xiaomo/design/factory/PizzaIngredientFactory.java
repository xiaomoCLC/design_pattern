package cn.xiaomo.design.factory;

import cn.xiaomo.design.factory.ingredient.Cheese;
import cn.xiaomo.design.factory.ingredient.Clams;
import cn.xiaomo.design.factory.ingredient.Dough;
import cn.xiaomo.design.factory.ingredient.Sauce;

/**
 *
 **/
public interface PizzaIngredientFactory {

  // 获得生面团原料
  Dough createDough();

  // 获得酱汁原料
  Sauce createSauce();

  // 获得奶酪原料
  Cheese createCheese();

  // 获得蛤蜊原料
  Clams createClams();
}
