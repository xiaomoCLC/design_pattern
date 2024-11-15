package cn.xiaomo.design.factory.pizza.v2;


import cn.xiaomo.design.factory.pizza.Pizza;

/**
 * @description 芝加哥口味——牡蛎披萨
 * 
 **/
public class ChicagoClamPizza implements Pizza {

    public void prepare() {
        System.out.println("ChicagoClamPizza prepare()");
    }

    public void bake() {
        System.out.println("ChicagoClamPizza bake()");
    }

    public void cut() {
        System.out.println("ChicagoClamPizza cut()");
    }

    public void box() {
        System.out.println("ChicagoClamPizza box()");
    }
}
