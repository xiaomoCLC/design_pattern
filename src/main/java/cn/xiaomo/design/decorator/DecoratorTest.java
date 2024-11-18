package cn.xiaomo.design.decorator;

/**
 *
 */
public class DecoratorTest {

  public static void main(String[] args) {
    // 创建煎饼果子
    Food jianBing = new JianBing();
    // 创建鸡蛋，加入到煎饼果子中
    Food egg = new Egg(jianBing);
    // 创建香肠，加入到煎饼果子中
    Food sausage = new Sausage(egg);
    System.out.println("总金额为：" + sausage.cost() + "元");
  }
}
