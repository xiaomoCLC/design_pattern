package cn.xiaomo.design.command;

/**
 *
 **/
public class LightOffCommand implements Command {

  // 某厂商提供的电灯操作类
  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}
