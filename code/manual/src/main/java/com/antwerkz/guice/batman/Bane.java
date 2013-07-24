package com.antwerkz.guice.batman;

import com.antwerkz.guice.RoomService;

public class Bane {
  private RoomService roomService;

  public Bane() {
    roomService = new RoomService();
  }
}
