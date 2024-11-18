package cn.xiaomo.design.proxy;

/**
 *
 */
public class ProxyTest {

  public static void main(String[] args) {
    // Subject subject = new RealSubject();
    Subject subject = new Proxy(new RealSubject());
    subject.request();
  }
}
