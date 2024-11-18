package cn.xiaomo.design.adapter;

/**
 *
 **/
public class NormalTarget implements Target {

  public void prepare() {
    System.out.println("NormalTarget prepare()");
  }

  public void execute() {
    System.out.println("NormalTarget execute()");
  }
}
