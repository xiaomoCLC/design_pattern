package cn.xiaomo.design.factory.pizza.v1;


import cn.xiaomo.design.factory.pizza.Pizza;

/**
 * @description 素食披萨
 **/
public class VeggiePizza implements Pizza {

    public void prepare() {
        System.out.println("VeggiePizza prepare()");
    }

    public void bake() {
        System.out.println("VeggiePizza bake()");
    }

    public void cut() {
        System.out.println("VeggiePizza cut()");
    }

    public void box() {
        System.out.println("VeggiePizza box()");
    }
}
