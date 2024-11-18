package cn.xiaomo.design.command;

/**
 * 某厂商提供的电灯操作类
 **/
public class Light {

  /**
   * 开灯操作
   */
  public void on() {
    System.out.println("Light on!");
  }

  /**
   * 关灯操作
   */
  public void off() {
    System.out.println("Light off!");
  }
}
