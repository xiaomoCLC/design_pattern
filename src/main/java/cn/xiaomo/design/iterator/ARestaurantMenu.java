package cn.xiaomo.design.iterator;

import java.util.ArrayList;

/**
 *
 **/
public class ARestaurantMenu implements Menu {

  private ArrayList<MenuItem> menuItems;

  public ARestaurantMenu() {
    menuItems = new ArrayList<>();
    addItem("【A餐厅】油条", "油条的描述", true, 0.5);
    addItem("【A餐厅】豆浆", "豆浆的描述", true, 1.9);
    addItem("【A餐厅】茶叶蛋", "茶叶蛋的描述", false, 1.5);
    addItem("【A餐厅】小笼包", "猪肉小笼包的描述", false, 2.1);
  }

  private void addItem(String name, String desc, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
    menuItems.add(menuItem);
  }

  public ArrayList<MenuItem> getMenuItems() {
    return menuItems;
  }

  @Override
  public MenuIterator iterator() {
    return new ARestaurantMenuIterator(menuItems);
  }
}
