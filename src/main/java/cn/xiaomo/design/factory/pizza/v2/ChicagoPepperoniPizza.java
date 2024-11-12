package cn.xiaomo.design.factory.pizza.v2;

import cn.xiaomo.design.factory.pizza.Pizza;

/**
 * @description 芝加哥口味——意大利辣香肠披萨
 **/
public class ChicagoPepperoniPizza implements Pizza {

    public void prepare() {
        System.out.println("ChicagoPepperoniPizza prepare()");
    }

    public void bake() {
        System.out.println("ChicagoPepperoniPizza bake()");
    }

    public void cut() {
        System.out.println("ChicagoPepperoniPizza cut()");
    }

    public void box() {
        System.out.println("ChicagoPepperoniPizza box()");
    }
}
