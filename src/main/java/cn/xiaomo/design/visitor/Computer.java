package cn.xiaomo.design.visitor;

/**
 *
 **/
public class Computer {

  private ComputerComponent memory;
  private ComputerComponent cpu;

  public Computer() {
    memory = new Memory();
    cpu = new Cpu();
  }

  /**
   * 攒机方法
   */
  public void buildComputer(Visitor visitor) {
    // 买cpu
    cpu.accept(visitor);
    // 买内存
    memory.accept(visitor);
  }
}
