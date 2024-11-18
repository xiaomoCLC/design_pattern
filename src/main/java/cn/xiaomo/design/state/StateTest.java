package cn.xiaomo.design.state;

/**
 *
 */
public class StateTest {

  public static void main(String[] args) {
    System.out.println("-----向口香糖机中放入1枚口香糖-----");
    GumballMachine machine = new GumballMachine(1);
    System.out.println("-----第一次购买口香糖-----");
    machine.insertCoin();
    machine.undoCoin();
    machine.turnCrank();
    System.out.println("-----第二次购买口香糖-----");
    machine.insertCoin();
    machine.turnCrank();
    System.out.println("-----第三次购买口香糖-----");
    machine.insertCoin();
    machine.turnCrank();
    machine.undoCoin();
  }
}
