package cn.xiaomo.design.adapter;

/**
 *
 **/
public class Client {

  Target target;

  public void work() {
    target.prepare();
    target.execute();
  }

  public void setTarget(Target target) {
    this.target = target;
  }
}
