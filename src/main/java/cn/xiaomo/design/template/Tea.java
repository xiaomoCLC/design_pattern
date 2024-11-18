package cn.xiaomo.design.template;

/**
 *
 **/
public class Tea extends MakeBeverage {

  @Override
  protected void brew() {
    System.out.println("【定制化】用沸水浸泡茶叶");
  }

  @Override
  protected void addCondiments() {
    System.out.println("【定制化】往茶叶中添加柠檬");
  }
}
