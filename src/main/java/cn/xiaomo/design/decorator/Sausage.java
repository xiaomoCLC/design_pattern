package cn.xiaomo.design.decorator;

/**
 *
 **/
public class Sausage extends AccessoriesDecorator {

  private Food food;

  public Sausage(Food food) {
    this.food = food;
  }

  public String getDescription() {
    return "香肠";
  }

  public double cost() {
    System.out.println("添加香肠售价：" + 3 + "元");
    return 3 + food.cost();
  }
}
