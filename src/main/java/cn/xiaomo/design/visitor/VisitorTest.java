package cn.xiaomo.design.visitor;

/**
 *
 */
public class VisitorTest {

  public static void main(String[] args) {
    // 创建待攒机的电脑
    Computer computer = new Computer();
    // 创建3个访问者用户
    Visitor personVisitor = new PersonVisitor();
    Visitor studentVisitor = new StudentVisitor();
    Visitor companyVisitor = new CompanyVisitor();
    // 普通用户攒机
    computer.buildComputer(personVisitor);
    System.out.println(String.format("针对%s，每台电脑售价为：%s元", personVisitor.visiterName(),
        personVisitor.price()));
    // 学生用户攒机
    computer.buildComputer(studentVisitor);
    System.out.println(String.format("针对%s，每台电脑售价为：%s元", studentVisitor.visiterName(),
        studentVisitor.price()));
    // 企业大客户用户攒机
    computer.buildComputer(companyVisitor);
    System.out.println(String.format("针对%s，每台电脑售价为：%s元", companyVisitor.visiterName(),
        companyVisitor.price()));
  }
}
