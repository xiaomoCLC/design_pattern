package cn.xiaomo.design.iterator;

import java.util.ArrayList;

/**
 *
 **/
public class Waitress {

  /**
   * 服务员打印菜单v1版本（无迭代器版本）
   */
  public void printMenuV1(ARestaurantMenu amenu, BRestaurantMenu bmenu) {
    // 针对List类型的菜单进行遍历输出
    ArrayList<MenuItem> amenuList = amenu.getMenuItems();
    for (int i = 0; i < amenuList.size(); i++) {
      print(amenuList.get(i));
    }
    // 针对Array类型的菜单进行遍历输出
    MenuItem[] bmenuArrays = bmenu.getMenuItems();
    for (int i = 0; i < bmenuArrays.length; i++) {
      print(bmenuArrays[i]);
    }
  }

  /**
   * 服务员打印菜单v2版本
   */
  public void printMenuV2(Menu... menus) {
    for (Menu menu : menus) {
      MenuIterator iter = menu.iterator();
      while (iter.hasNext()) {
        print(iter.next());
      }
    }
  }

  private void print(MenuItem menuItem) {
    System.out.println(
        String.format("name=%s, desc=%s, price=%s", menuItem.getName(), menuItem.getDesc(),
            menuItem.getPrice()));
  }
}
