package guiced.services;

public class GuicedService3 {
  @com.google.inject.Inject
  private GuicedService1 guicedService1;

  @com.google.inject.Inject
  private GuicedService2 guicedService2;

  @com.google.inject.Inject
  private GuicedService4 guicedService4;

  @com.google.inject.Inject
  private GuicedService5 guicedService5;

  public GuicedService3() {
    //  stuff goes here
  }
  // lots of methods here
}
