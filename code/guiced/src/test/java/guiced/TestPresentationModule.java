package guiced;

import com.google.inject.AbstractModule;
import guiced.services.GuicedService1;

public class TestPresentationModule extends AbstractModule {
  @Override
  protected void configure() {
    binder().bind(GuicedService1.class)
        .toInstance(new GuicedService1(18));
  }
}
