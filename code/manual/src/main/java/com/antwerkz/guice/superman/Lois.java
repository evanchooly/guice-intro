package com.antwerkz.guice.superman;

import com.antwerkz.guice.RoomService;
import com.antwerkz.guice.SomeService;

public class Lois {
  private SomeService someService;

  private RoomService roomService;

  public Lois() {
    roomService = new RoomService();
    someService = new SomeService();
  }
}
