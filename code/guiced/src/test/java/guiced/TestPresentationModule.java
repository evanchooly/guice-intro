package guiced;

import com.google.inject.AbstractModule;
import guiced.services.GuicedService1;
import guiced.util.MyUtil;

public class TestPresentationModule extends AbstractModule {
  @Override
  protected void configure() {
    binder().bind(GuicedService1.class)
        .toInstance(new GuicedService1(18));

    binder().requestStaticInjection(MyUtil.class);
  }
}
