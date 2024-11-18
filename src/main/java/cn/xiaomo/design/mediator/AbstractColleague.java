package cn.xiaomo.design.mediator;

/**
 * 同事类
 */
public abstract class AbstractColleague {

  protected Mediator mediator; // 中介者

  public AbstractColleague(Mediator mediator) {
    this.mediator = mediator;
  }
}
