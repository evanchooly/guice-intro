package guiced.services;

import com.google.inject.Inject;

public class GuicedService1 {
  @Inject
  private GuicedService2 guicedService2;

  @Inject
  private GuicedService3 guicedService3;

  @Inject
  private GuicedService4 guicedService4;

  @Inject
  private GuicedService5 guicedService5;

  private int bob;

  public GuicedService1(int bob) {
    //  stuff goes here
    this.bob = bob;
  }
  // lots of methods here

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("GuicedService1{");
    sb.append("bob=").append(bob);
    sb.append(",\n guicedService2=").append(guicedService2);
    sb.append(",\n guicedService3=").append(guicedService3);
    sb.append(",\n guicedService4=").append(guicedService4);
    sb.append(",\n guicedService5=").append(guicedService5);
    sb.append('}');
    return sb.toString();
  }
}
