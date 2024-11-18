package cn.xiaomo.design.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 核酸医院和网点信息信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NucleicInfo {

  private Integer id;     // 唯一标识
  private String name;    // 核酸医院网点名称
}
