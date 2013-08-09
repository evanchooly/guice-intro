package guiced.util;

import com.google.inject.Inject;
import guiced.services.GuicedService1;

public class MyUtil {
  @Inject
  private static GuicedService1 service;

  public static void doSomething() {
    System.out.println("service = " + service);
  }
}
