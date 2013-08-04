package guiced;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guiced.services.GuicedService1;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Injections {
  private Injector injector;

  @BeforeClass
  public void guice() {
    injector = Guice.createInjector(new PresentationModule());
  }

  @Test
  public void service() {
    GuicedService1 service = injector.getInstance(GuicedService1.class);
    System.out.println("service = " + service);
  }

}
