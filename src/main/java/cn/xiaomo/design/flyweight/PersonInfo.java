package cn.xiaomo.design.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 人员信息实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonInfo {

  private String name;        // 姓名
  private String address;     // 居住的详细地址
  private Integer nucleicId;  // 核酸医院或网点唯一标识
}
