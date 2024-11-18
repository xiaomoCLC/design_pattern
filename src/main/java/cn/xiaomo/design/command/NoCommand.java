package cn.xiaomo.design.command;

/**
 *
 **/
public class NoCommand implements Command {

  public void execute() {
    System.out.println("Doing nothing!");
  }
}
