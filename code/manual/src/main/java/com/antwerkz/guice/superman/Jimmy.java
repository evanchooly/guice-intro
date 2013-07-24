package com.antwerkz.guice.superman;

import com.antwerkz.guice.AnotherService;
import com.antwerkz.guice.RoomService;
import com.antwerkz.guice.SomeNeedyService;
import com.antwerkz.guice.SomeService;

public class Jimmy {
  private AnotherService anotherService;

  private RoomService roomService;

  private SomeNeedyService someNeedyService;

  private SomeService someService;

  public Jimmy() {
    anotherService = new AnotherService();
    roomService = new RoomService();
    someNeedyService = new SomeNeedyService();
    someService = new SomeService();
  }
}
