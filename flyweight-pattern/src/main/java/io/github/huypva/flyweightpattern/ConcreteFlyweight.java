package io.github.huypva.flyweightpattern;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class ConcreteFlyweight implements Flyweight {

  private String key;

  public ConcreteFlyweight(String key) {
    this.key = key;
    log.info("Conduct ConcreteFlyweight {}.", key);
  }

  @Override
  public void operate() {
    log.info("ConcreteFlyweight {} operate.", key);
  }
}
