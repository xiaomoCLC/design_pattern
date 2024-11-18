package cn.xiaomo.design.facade;

/**
 *
 **/
public class Car {

  private Engine engine;
  private Door door;
  private DashboardDisplay display;

  public Car() {
    engine = new Engine();
    door = new Door();
    display = new DashboardDisplay();
  }

  /**
   * 汽车启动
   */
  public void start() {
    door.lock();
    engine.start();
    display.refreshDisplay();
  }
}
