package cn.xiaomo.design.chain;

import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/**
 * 法务部门处理类
 */
public class LawProcessor extends AbstractProcessor {

  @Override
  protected int emailType() {
    return EmailType.SLANDER_EMAIL.type; // 法务部门负责处理诽谤邮件
  }

  @Override
  protected void execute(List<Email> emails) {
    if (CollectionUtils.isNotEmpty(emails)) {
      System.out.println("-------法务部门开始处理邮件-------");
      emails.stream().forEach(email -> System.out.println(email.getContent()));
    }
  }
}
