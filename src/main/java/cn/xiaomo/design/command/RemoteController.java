package cn.xiaomo.design.command;

/**
 *
 **/
public class RemoteController {

  private Command[] onCommands;   // 开启开关命令集合
  private Command[] offCommands;  // 关闭开关命令集合

  public RemoteController() {
    onCommands = new Command[8];    // 创建8个控制开启操作的按钮
    offCommands = new Command[8];   // 创建8个控制关闭操作的按钮
    // 默认这16个按钮操作都是"无指令的"
    for (int i = 0; i < 8; i++) {
      onCommands[i] = new NoCommand();
      offCommands[i] = new NoCommand();
    }
  }

  /**
   * 往遥控器中某个位置添加开/关命令
   */
  public void addCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  /**
   * 按遥控器中某个开启键
   */
  public void pushOnButton(int slot) {
    onCommands[slot].execute();
  }

  /**
   * 按遥控器中某个关闭键
   */
  public void pushOffButton(int slot) {
    offCommands[slot].execute();
  }
}
