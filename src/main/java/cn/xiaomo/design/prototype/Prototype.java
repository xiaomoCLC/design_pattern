package cn.xiaomo.design.prototype;

import lombok.Data;

/**
 * @author xiaomo
 */
@Data
public class Prototype implements Cloneable {

  public static void main(String[] args) throws CloneNotSupportedException {
    System.out.println("【步骤1】开始执行Prototype类型的对象创建工作");
    Prototype prototype = new Prototype();
    /** 执行clone方法创建的Prototype对象 */
    System.out.println("【步骤2】开始执行clone操作");
    Prototype prototype1 = prototype.clone();
  }

  public Prototype() {
    System.out.println("执行构造方法");
  }

  @Override
  protected Prototype clone() throws CloneNotSupportedException {
    return (Prototype) super.clone();
  }
}
