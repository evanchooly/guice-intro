package com.antwerkz.guice.superman;

import com.antwerkz.guice.AnotherService;
import com.antwerkz.guice.RoomService;
import com.antwerkz.guice.SomeNeedyService;
import com.antwerkz.guice.SomeService;

public class Zod {
  private SomeService someService;

  private SomeNeedyService someNeedyService;

  private RoomService roomService;

  private AnotherService anotherService;

  public Zod() {
    anotherService = new AnotherService();
    roomService = new RoomService();
    someNeedyService = new SomeNeedyService();
    someService = new SomeService();
  }
}
