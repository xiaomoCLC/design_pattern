package cn.xiaomo.design.state;

/**
 * 口香糖售卖状态类
 */
public class SoldState implements State {

  private GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("口香糖正在出货中，请稍等。无须再次投入钱币！");
  }

  @Override
  public void undoCoin() {
    System.out.println("口香糖正在出货中，请稍等。不能退回钱币！");
  }

  @Override
  public void turnCrank() {
    System.out.println("口香糖正在出货中，请稍等。不需要再次扭转曲柄！");
  }

  @Override
  public void dispense() {
    if (gumballMachine.getCount() > 0) {
      System.out.println("口香糖正在出货中，请稍等！");
      gumballMachine.releaseBall();
      gumballMachine.setState(gumballMachine.getNoCoinState()); // 状态流转
    } else {
      System.out.println("口香糖库存不足，无法出货！");
      gumballMachine.setState(gumballMachine.getSoldOutState()); // 状态流转
    }
  }
}
