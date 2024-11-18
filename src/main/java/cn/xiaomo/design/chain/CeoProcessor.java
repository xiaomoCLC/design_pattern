package cn.xiaomo.design.chain;

import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/**
 * CEO处理类
 */
public class CeoProcessor extends AbstractProcessor {

  @Override
  protected int emailType() {
    return EmailType.FANS_EMAIL.type; // CEO负责处理粉丝邮件
  }

  @Override
  protected void execute(List<Email> emails) {
    if (CollectionUtils.isNotEmpty(emails)) {
      System.out.println("-------CEO开始处理邮件-------");
      emails.stream().forEach(email -> System.out.println(email.getContent()));
    }
  }
}
