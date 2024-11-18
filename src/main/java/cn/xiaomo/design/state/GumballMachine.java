package cn.xiaomo.design.state;

import lombok.Data;

/**
 * 口香糖售卖机
 */
@Data
public class GumballMachine {

  private State noCoinState;
  private State hasCoinState;
  private State soldState;
  private State soldOutState;

  private State state = soldOutState; // 口香糖机默认状态为售罄状态
  int count; // 口香糖库存量

  public GumballMachine(int numberGumballs) {
    noCoinState = new NoCoinState(this);
    hasCoinState = new HasCoinState(this);
    soldState = new SoldState(this);
    soldOutState = new SoldOutState(this);
    count = numberGumballs;
    if (numberGumballs > 0) {
      state = noCoinState; // 如果采购了口香糖（numberGumballs > 0），则口香糖机的状态为未投币状态
    }
  }

  // 投入钱币
  public void insertCoin() {
    state.insertCoin();
  }

  // 退出钱币
  public void undoCoin() {
    state.undoCoin();
  }

  // 扭转曲柄
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  // 减少库存
  public void releaseBall() {
    if (count > 0) {
      System.out.println("一个口香糖正在出库");
      --count;
    } else {
      System.out.println("库存不足，一个口香糖无法出库");
    }
  }

  // 设置状态
  void setState(State state) {
    this.state = state;
  }
}
