package cn.xiaomo.design.visitor;

/**
 *
 **/
public class Cpu implements ComputerComponent {

  public int price = 100; // 全国标准售价

  @Override
  public int price() {
    return 100;
  }

  @Override
  public String version() {
    return "v1";
  }

  @Override
  public String desc() {
    return "英特尔CPU";
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visitorCpu(this);
  }
}
