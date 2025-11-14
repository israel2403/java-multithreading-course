package com.huerta.isra.threadmanipulation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Runner1 {
  private static final Logger log = LoggerFactory.getLogger(Runner1.class);

  public void execute() {
    for (int i = 0; i < 10; i++) {
      log.info("Runner1: {}", i);
    }
  }
}

class Runner2 {
  private static final Logger log = LoggerFactory.getLogger(Runner2.class);

  public void execute() {
    for (int i = 0; i < 10; i++) {
      log.info("Runner2: {}", i);
    }
  }
}

public class App {

  private static final Logger log = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    var ruuner1 = new Runner1();
    var runner2 = new Runner2();

    ruuner1.execute();
    runner2.execute();
  }

}
