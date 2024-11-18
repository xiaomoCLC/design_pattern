package cn.xiaomo.design.mediator;

/**
 *
 */
public class MediatorTest {

  public static void main(String[] args) {
    // 创建中介者
    Mediator mediator = new Mediator();
    System.out.println("--------采购人员采购100台电脑--------");
    Purchase purchase = new Purchase(mediator);
    purchase.buyComputer(100);
    System.out.println("--------销售人员销售1台电脑--------");
    Sale sale = new Sale(mediator);
    sale.sellComputer(1);
    System.out.println("--------库房人员清库处理--------");
    Stock stock = new Stock(mediator);
    stock.clearStock();
  }
}
