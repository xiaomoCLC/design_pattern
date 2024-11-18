package cn.xiaomo.design.bridge;

import lombok.Data;

/**
 * 抽象画笔类
 */
@Data
public abstract class BrushPenAbstraction {

  // 颜色接口(Has-A关系，桥接)
  protected ColorImplementor color;

  // 绘画操作
  public abstract void draw();
}
