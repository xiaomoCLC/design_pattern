package cn.xiaomo.design.command;

/**
 *
 */
public class CommandTest {

  public static void main(String[] args) {
    // 创建遥控器和灯
    RemoteController controller = new RemoteController();
    Light light = new Light();
    // 向遥控器中初始化指令
    controller.addCommand(0, new LightOnCommand(light), new LightOffCommand(light));
    controller.pushOnButton(0); // 按下遥控器中第1排的ON按钮
    controller.pushOffButton(0); // 按下遥控器中第1排的OFF按钮
  }
}
