package cn.xiaomo.design.mediator;

/**
 * 中介者/调停者
 */
public class Mediator {

  protected Purchase purchase;    // 采购人员
  protected Sale sale;            // 销售人员
  protected Stock stock;          // 库存人员

  public Mediator() {
    purchase = new Purchase(this);
    sale = new Sale(this);
    stock = new Stock(this);
  }

  /**
   * 采购电脑
   */
  public void purchaseByComputer(int num) {
    int saleStatus = sale.getSaleStatus();
    // 如果销售情况不好（即：没有超过80台），则采购总数减半
    String msg = "正常采购，";
    if (saleStatus <= 80) {
      num = num / 2;
      msg = "由于销售不佳，采购总数减半，";
    }
    System.out.println(
        msg + "原有库存电脑" + stock.getStockNumber() + "台，现采购电脑" + num + "台");
    stock.increaseComputer(num);
  }

  /**
   * 销售电脑
   */
  public void saleSellComputer(int num) {
    // 如果库存数量不足，则采购2倍的num电脑数，暂时只售卖库存中有的数量
    int stockNum;
    if ((stockNum = stock.getStockNumber()) < num) {
      purchase.buyComputer(2 * num); // 采购两倍数量的电脑
      num = stockNum; // 由于采购到货需要时间，所以暂时只售卖库存中有的数量
    }
    stock.decreaseComputer(num);
  }

  /**
   * 折价销售电脑
   */
  public void saleOffSale() {
    sale.offSale();
  }

  /**
   * 清理库存
   */
  public void stockClear() {
    sale.offSale(); // 折价销售电脑
    purchase.refuseBuyComputer(); // 不要采购电脑
  }
}
