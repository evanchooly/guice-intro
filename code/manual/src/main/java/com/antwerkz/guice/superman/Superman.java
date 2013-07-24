package com.antwerkz.guice.superman;

import com.antwerkz.guice.AnotherService;

public class Superman {
  private AnotherService anotherService;

  public Superman() {
    anotherService = new AnotherService();
  }
}
