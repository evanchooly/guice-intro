package com.antwerkz.guice.batman;

import com.antwerkz.guice.AnotherService;

public class Robin {
  private final AnotherService another;

  public Robin() {
    another = new AnotherService();
  }
}
