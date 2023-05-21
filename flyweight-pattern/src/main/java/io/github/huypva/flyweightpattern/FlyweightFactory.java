package io.github.huypva.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huypva
 */
public class FlyweightFactory {

  private static Map<String, Flyweight> flyweightFactory = new HashMap<>();

  public static synchronized Flyweight getFlyweight(String key) {
    Flyweight flyweight = flyweightFactory.get(key);
    if (flyweight == null) {
      flyweight = new ConcreteFlyweight(key);
      flyweightFactory.put(key, flyweight);
    }

    return flyweight;
  }


}
