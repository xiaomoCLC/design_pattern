package cn.xiaomo.design.state;

/**
 * 状态接口类
 */
public interface State {

  /**
   * 投入硬币操作
   */
  void insertCoin();

  /**
   * 撤销投币操作
   */
  void undoCoin();

  /**
   * 扭转曲柄操作
   */
  void turnCrank();

  /**
   * 发放口香糖操作
   */
  void dispense();
}
