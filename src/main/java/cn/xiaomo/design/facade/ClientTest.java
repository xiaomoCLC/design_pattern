package cn.xiaomo.design.facade;

/**
 *
 */
public class ClientTest {

  public static void main(String[] args) {
    Car car = new Car(); // 拥有一辆车
    car.start(); // 启动汽车，用户并不知道引擎、车门、中控的运作
  }
}
