package cn.xiaomo.design.visitor;

/**
 *
 **/
public class Memory implements ComputerComponent {

  public int price = 400; // 全国标准售价

  @Override
  public int price() {
    return price;
  }

  @Override
  public String version() {
    return "v4";
  }

  @Override
  public String desc() {
    return "金士顿内存";
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visitorMemory(this);
  }
}
