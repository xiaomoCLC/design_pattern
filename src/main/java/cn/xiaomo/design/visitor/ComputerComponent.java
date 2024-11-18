package cn.xiaomo.design.visitor;

/**
 *
 **/
public interface ComputerComponent {

  /**
   * 售价
   */
  int price();

  /**
   * 硬件版本
   */
  String version();

  /**
   * 描述
   */
  String desc();

  /**
   * 接收访问者
   */
  void accept(Visitor visitor);
}
