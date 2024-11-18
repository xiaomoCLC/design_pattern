package cn.xiaomo.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 **/
public class ARestaurantMenuIterator implements MenuIterator {

  private Iterator<MenuItem> iterator;

  public ARestaurantMenuIterator(ArrayList<MenuItem> menuItems) {
    iterator = menuItems.iterator();
  }

  @Override
  public boolean hasNext() {
    return iterator.hasNext();
  }

  @Override
  public MenuItem next() {
    return iterator.next();
  }
}
