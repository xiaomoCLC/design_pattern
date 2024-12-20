package cn.xiaomo.design.mediator;

import java.util.Random;

/**
 * 销售人员
 */
public class Sale extends AbstractColleague {

  public Sale(Mediator mediator) {
    super(mediator);
  }

  /**
   * 销售电脑
   */
  public void sellComputer(int number) {
    super.mediator.saleSellComputer(number);
    System.out.println("销售电脑" + number + "台");
  }

  /**
   * 获得销售情况（即：售卖了多少台电脑）
   */
  public int getSaleStatus() {
    // 模拟销售数量
    int sellNumber = new Random(System.currentTimeMillis()).nextInt(100);
    System.out.println("电脑的销售情况为：" + sellNumber + "台");
    return sellNumber;
  }

  /**
   * 折价处理
   */
  public void offSale() {
    System.out.println("折价销售电脑");
  }
}
