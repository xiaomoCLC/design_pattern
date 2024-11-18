package cn.xiaomo.design.decorator;

/**
 *
 **/
public class Egg extends AccessoriesDecorator {

  private Food food;

  public Egg(Food food) {
    this.food = food;
  }

  public String getDescription() {
    return "鸡蛋";
  }

  public double cost() {
    System.out.println("添加鸡蛋售价：" + 1 + "元");
    return 1 + food.cost();
  }
}
