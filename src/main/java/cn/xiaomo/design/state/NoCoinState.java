package cn.xiaomo.design.state;

/**
 * 没有投放钱币状态类
 */
public class NoCoinState implements State {

  private GumballMachine gumballMachine; // 口香糖机

  public NoCoinState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("投入钱币成功！");
    gumballMachine.setState(gumballMachine.getHasCoinState()); // 状态流转
  }

  @Override
  public void undoCoin() {
    System.out.println("你还没有投入钱币，不能退回钱币！");
  }

  @Override
  public void turnCrank() {
    System.out.println("你还没有投入钱币，不能扭转曲柄！");
  }

  @Override
  public void dispense() {
    System.out.println("你还没有投入钱币，口香糖不可以发放！");
  }
}
