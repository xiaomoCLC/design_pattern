package cn.xiaomo.design.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

  private String content; // 文档的内容

  public void print() {
    System.out.println("content=" + content);
  }
}
