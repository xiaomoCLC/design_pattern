package cn.xiaomo.design.command;

/**
 *
 **/
public class LightOnCommand implements Command {

  // 某厂商提供的电灯操作类
  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }
}
