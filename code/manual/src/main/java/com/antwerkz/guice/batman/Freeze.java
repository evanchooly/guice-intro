package com.antwerkz.guice.batman;

import com.antwerkz.guice.SomeNeedyService;
import com.antwerkz.guice.SomeService;

public class Freeze {
  private final SomeService some;

  private final SomeNeedyService needy;

  public Freeze() {
    needy = new SomeNeedyService();
    some = new SomeService();
  }
}
