package cn.xiaomo.design.decorator;

/**
 *
 **/
public class JianBing extends Food {

  public JianBing() {
    description = "基础版煎饼果子";
  }

  public double cost() {
    System.out.println("基础版煎饼果子售价：" + 7 + "元");
    return 7;
  }
}
