package cn.xiaomo.design.factory;

import cn.xiaomo.design.factory.store.v1.PizzaStoreV1;
import cn.xiaomo.design.factory.store.v2.PizzaStoreV2;
import cn.xiaomo.design.factory.store.v3.PizzaStoreV3;

/**
 *
 */
public class PizzaStoreTest {

  public static void main(String[] args) {
    System.out.println("----------简单工厂----------");
    pizzaStoreV1Test();
    System.out.println("----------工厂方法----------");
    // pizzaStoreV2Test();
    System.out.println("----------抽象工厂----------");
    // pizzaStoreV3Test();
  }

  /**
   * 简单工厂
   */
  private static void pizzaStoreV1Test() {
    PizzaStoreV1 pizzaStore = new PizzaStoreV1(new SimplePizzaFactory());
    pizzaStore.orderPizza("cheese");
  }

  /**
   * 工厂方法
   */
  private static void pizzaStoreV2Test() {
    PizzaStoreV2 pizzaStore =
        new cn.xiaomo.design.factory.store.v2.ChicagoPizzaStore(); // 选择纽约地区的披萨店
    pizzaStore.orderPizza("cheese");
  }

  /**
   * 抽象工厂
   */
  private static void pizzaStoreV3Test() {
    PizzaStoreV3 pizzaStore = new cn.xiaomo.design.factory.store.v3.NYPizzaStore();
    pizzaStore.orderPizza("cheese");
  }
}
