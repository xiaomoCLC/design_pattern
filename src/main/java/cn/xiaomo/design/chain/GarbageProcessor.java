package cn.xiaomo.design.chain;

import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/**
 * 垃圾邮件处理类
 */
public class GarbageProcessor extends AbstractProcessor {

  @Override
  protected int emailType() {
    return EmailType.GARBAGE_EMAIL.type; // 垃圾处理器负责处理垃圾邮件
  }

  @Override
  protected void execute(List<Email> emails) {
    if (CollectionUtils.isNotEmpty(emails)) {
      System.out.println("-------垃圾开始处理邮件-------");
      emails.stream().forEach(email -> System.out.println(email.getContent()));
    }
  }
}
