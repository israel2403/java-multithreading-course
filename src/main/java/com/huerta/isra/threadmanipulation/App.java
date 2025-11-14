package com.huerta.isra.threadmanipulation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Runner1 implements Runnable {
  private static final Logger log = LoggerFactory.getLogger(Runner1.class);

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      log.info("Runner1: {}", i);
    }
  }
}

class Runner2 implements Runnable {
  private static final Logger log = LoggerFactory.getLogger(Runner2.class);

  public void execute() {
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      log.info("Runner2: {}", i);
    }
  }
}

public class App {

  private static final Logger log = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    var t1 = new Thread(new Runner1());
    var t2 = new Thread(new Runner2());

    t1.start();
    t2.start();
  }

}
