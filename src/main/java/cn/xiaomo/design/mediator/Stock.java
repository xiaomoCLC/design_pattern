package cn.xiaomo.design.mediator;

/**
 * 库存人员
 */
public class Stock extends AbstractColleague {

  private static int computerNum = 100; // 电脑的库存量，默认100台

  public Stock(Mediator mediator) {
    super(mediator);
  }

  /**
   * 增加电脑库存
   */
  public void increaseComputer(int number) {
    computerNum += number;
    System.out.println("电脑的库存数量为：" + computerNum);
  }

  /**
   * 减少电脑库存
   */
  public void decreaseComputer(int number) {
    computerNum -= number;
    System.out.println("电脑的库存数量为：" + computerNum);
  }

  /**
   * 获得当前电脑的库存
   */
  public int getStockNumber() {
    return computerNum;
  }

  /**
   * 清理库存
   */
  public void clearStock() {
    System.out.println("清理电脑的库存数量为：" + computerNum);
    super.mediator.stockClear();
  }
}
