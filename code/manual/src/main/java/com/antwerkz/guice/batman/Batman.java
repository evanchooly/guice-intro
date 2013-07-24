package com.antwerkz.guice.batman;

import com.antwerkz.guice.SomeNeedyService;

public class Batman {
  private final SomeNeedyService needy;

  public Batman() {
    needy = new SomeNeedyService();
  }
}
