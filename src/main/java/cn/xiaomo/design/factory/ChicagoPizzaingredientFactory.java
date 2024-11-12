package cn.xiaomo.design.factory;

import cn.xiaomo.design.factory.ingredient.*;

/**
 * @description 芝加哥原料工厂
 * 
 **/
public class ChicagoPizzaingredientFactory implements PizzaIngredientFactory {

    // 薄的面包皮生面团
    public Dough createDough() {
        return new ThinCrustDough();
    }

    // 番茄酱酱汁
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    // 帕尔玛奶酪
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    // 新鲜蛤蜊
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public String toString() {
        return "ChicagoPizzaingredientFactory";
    }
}
