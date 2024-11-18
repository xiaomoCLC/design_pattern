package cn.xiaomo.design.chain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

  private int type; // 邮件类型
  private String content; // 邮件内容
}
