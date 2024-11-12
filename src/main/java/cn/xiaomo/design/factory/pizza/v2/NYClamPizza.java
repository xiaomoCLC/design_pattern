package cn.xiaomo.design.factory.pizza.v2;

import cn.xiaomo.design.factory.pizza.Pizza;

/**
 * @description 纽约口味——牡蛎披萨
 * 
 **/
public class NYClamPizza implements Pizza {

    public void prepare() {
        System.out.println("NYClamPizza prepare()");
    }

    public void bake() {
        System.out.println("NYClamPizza bake()");
    }

    public void cut() {
        System.out.println("NYClamPizza cut()");
    }

    public void box() {
        System.out.println("NYClamPizza box()");
    }
}
