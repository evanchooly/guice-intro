package guiced;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guiced.services.GuicedService1;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Injections {
  private Injector injector;

  private Injector testInjector;

  @BeforeClass
  public void guice() {
    injector = Guice.createInjector(new PresentationModule());
    testInjector = Guice.createInjector(new TestPresentationModule());
  }

  @Test
  public void service() {
    System.out.println("service = " + injector.getInstance(GuicedService1.class));
    System.out.println("test service = " + testInjector.getInstance(GuicedService1.class));
  }

}
