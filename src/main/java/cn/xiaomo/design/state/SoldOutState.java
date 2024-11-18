package cn.xiaomo.design.state;

/**
 * 口香糖售罄状态类
 */
public class SoldOutState implements State {

  private GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("口香糖已经售罄。不能投入钱币");
  }

  @Override
  public void undoCoin() {
    System.out.println("退回钱币成功！");
  }

  @Override
  public void turnCrank() {
    System.out.println("口香糖已经售罄。不能扭转曲柄！");
  }

  @Override
  public void dispense() {
    System.out.println("口香糖已经售罄。口香糖无法出售！");
  }
}
