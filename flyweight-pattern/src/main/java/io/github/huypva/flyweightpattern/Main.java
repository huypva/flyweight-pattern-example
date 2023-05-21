package io.github.huypva.flyweightpattern;


import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Main {

  public static void main(String[] args) {
    log.info("Create a flyweight.");
    Flyweight flyweight1 = FlyweightFactory.getFlyweight("key1");
    flyweight1.operate();

    log.info("Use the flyweight existed");
    Flyweight flyweight2 = FlyweightFactory.getFlyweight("key1");
    flyweight2.operate();
  }
}
