package cn.xiaomo.design.decorator;

/**
 *
 **/
public abstract class Food {

  String description = "食物";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
