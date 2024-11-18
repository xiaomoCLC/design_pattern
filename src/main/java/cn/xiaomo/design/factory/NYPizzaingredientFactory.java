package cn.xiaomo.design.factory;

import cn.xiaomo.design.factory.ingredient.Cheese;
import cn.xiaomo.design.factory.ingredient.Clams;
import cn.xiaomo.design.factory.ingredient.Dough;
import cn.xiaomo.design.factory.ingredient.FrozenClams;
import cn.xiaomo.design.factory.ingredient.MozzarellaCheese;
import cn.xiaomo.design.factory.ingredient.PlumTomatoSauce;
import cn.xiaomo.design.factory.ingredient.Sauce;
import cn.xiaomo.design.factory.ingredient.ThickCrustDough;

/**
 *
 **/
public class NYPizzaingredientFactory implements PizzaIngredientFactory {

  // 厚的面包皮生面团
  public Dough createDough() {
    return new ThickCrustDough();
  }

  // 梅子西红柿酱汁
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  // 莫泽雷勒干酪
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  // 冷冻蛤蜊
  public Clams createClams() {
    return new FrozenClams();
  }

  @Override
  public String toString() {
    return "NYPizzaingredientFactory";
  }
}
