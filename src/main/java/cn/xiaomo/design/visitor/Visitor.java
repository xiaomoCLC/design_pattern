package cn.xiaomo.design.visitor;

/**
 *
 **/
public interface Visitor {

  /**
   * 访问者CPU价格
   */
  void visitorCpu(Cpu cpu);

  /**
   * 访问者内存价格
   */
  void visitorMemory(Memory memory);

  /**
   * 获得总价
   */
  int price();

  /**
   * 访问者名称
   */
  String visiterName();
}
