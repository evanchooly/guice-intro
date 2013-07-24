package com.antwerkz.guice.batman;

import com.antwerkz.guice.SomeNeedyService;
import com.antwerkz.guice.SomeService;

public class Penguin {
  private final SomeService some;

   private final SomeNeedyService needy;
  public Penguin() {
    some = new SomeService();
    needy = new SomeNeedyService();
  }
}
