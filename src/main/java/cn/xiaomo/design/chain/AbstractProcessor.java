package cn.xiaomo.design.chain;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 抽象处理类
 */
public abstract class AbstractProcessor {

  // 责任链中下一个处理节点
  private AbstractProcessor nextProcessor;

  public final void handleMessage(List<Email> emails) {
    List<Email> filterEmails = emails.stream().filter(email -> email.getType() == this.emailType())
        .collect(Collectors.toList());
    this.execute(filterEmails);
    if (this.nextProcessor == null) {
      return;
    }
    this.nextProcessor.handleMessage(emails);
  }

  /**
   * 设置责任链的下一个处理器
   */
  public void setNextProcessor(AbstractProcessor processor) {
    this.nextProcessor = processor;
  }

  /**
   * 获得当前Processor可以处理的邮件类型
   */
  protected abstract int emailType();

  /**
   * 具体处理邮件的方法
   */
  protected abstract void execute(List<Email> emails);
}
