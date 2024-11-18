package cn.xiaomo.design.composite;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 管理层员工（即：非叶子节点职员）
 */
public class BranchCorp extends AbstractCorp {

  private ArrayList<AbstractCorp> corps = Lists.newArrayList(); // 管理的直属下属员工

  public BranchCorp(String name, String position, int salary) {
    super(name, position, salary);
  }

  // 添加职员
  public void addSubCorp(AbstractCorp... corp) {
    corps.addAll(Arrays.asList(corp));
  }

  // 返回手下的职员
  public ArrayList<AbstractCorp> getSubCorp() {
    return corps;
  }
}
