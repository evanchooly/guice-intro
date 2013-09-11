package services;

public class Service1 {
  private final services.Service2 service2 = new Service2();
  private final services.Service3 service3 = new Service3();
  private final services.Service4 service4 = new Service4("bar");
  private final services.Service5 service5 = new Service5();

  public Service1() {
    //  stuff goes here
  }

  // lots of methods here
}
