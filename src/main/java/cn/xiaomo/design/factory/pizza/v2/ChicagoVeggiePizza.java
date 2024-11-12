package cn.xiaomo.design.factory.pizza.v2;

import cn.xiaomo.design.factory.pizza.Pizza;

/**
 * @description 芝加哥口味——素食披萨
 * 
 **/
public class ChicagoVeggiePizza implements Pizza {

    public void prepare() {
        System.out.println("ChicagoVeggiePizza prepare()");
    }

    public void bake() {
        System.out.println("ChicagoVeggiePizza bake()");
    }

    public void cut() {
        System.out.println("ChicagoVeggiePizza cut()");
    }

    public void box() {
        System.out.println("ChicagoVeggiePizza box()");
    }
}