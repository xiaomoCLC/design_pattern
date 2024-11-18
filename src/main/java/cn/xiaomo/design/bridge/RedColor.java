package cn.xiaomo.design.bridge;

/**
 * 红色墨水
 */
public class RedColor implements ColorImplementor {

  @Override
  public String getColor() {
    return "Red";
  }
}
