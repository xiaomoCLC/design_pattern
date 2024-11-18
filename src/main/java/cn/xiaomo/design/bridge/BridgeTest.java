package cn.xiaomo.design.bridge;

/**
 *
 */
public class BridgeTest {

  public static void main(String[] args) {
    BrushPenAbstraction brushPen = new BigBurshPen();
    brushPen.setColor(new RedColor());
    brushPen.draw();
    brushPen.setColor(new BlueColor());
    brushPen.draw();
    brushPen = new SmallBurshPen();
    brushPen.setColor(new BlueColor());
    brushPen.draw();
  }
}
