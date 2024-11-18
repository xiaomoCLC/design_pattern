package cn.xiaomo.design.state;

/**
 * 已经投放钱币状态类
 */
public class HasCoinState implements State {

  private GumballMachine gumballMachine;

  public HasCoinState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("您已经投入钱币！无须再次投入钱币！");
  }

  @Override
  public void undoCoin() {
    System.out.println("退款成功！");
    gumballMachine.setState(gumballMachine.getNoCoinState()); // 状态流转
  }

  @Override
  public void turnCrank() {
    System.out.println("正在出货中，请稍等……");
    gumballMachine.setState(gumballMachine.getSoldState()); // 状态流转
  }

  @Override
  public void dispense() {
    System.out.println("你还没有扭转曲柄，口香糖不可以发放！");
  }
}
