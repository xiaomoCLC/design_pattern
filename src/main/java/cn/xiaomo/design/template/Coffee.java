package cn.xiaomo.design.template;

/**
 *
 **/
public class Coffee extends MakeBeverage {

  @Override
  protected void brew() {
    System.out.println("【定制化】用沸水冲泡咖啡");
  }

  @Override
  protected void addCondiments() {
    System.out.println("【定制化】往咖啡中添加糖和牛奶");
  }
}
