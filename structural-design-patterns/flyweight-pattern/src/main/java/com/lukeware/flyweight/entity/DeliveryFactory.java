package com.lukeware.flyweight.entity;

import com.lukeware.flyweight.IDelivery;
import com.lukeware.flyweight.IDeliveryFlyweight;

import java.util.Map;
import java.util.Objects;

/**
 * @author Diego Morais
 */
public final class DeliveryFactory {
  private static DeliveryFactory instance;
  private Map<String, IDeliveryFlyweight> locations;
  private final Delivery delivery;

  private DeliveryFactory() {
    super();
    this.delivery = new Delivery();
  }

  public static DeliveryFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (DeliveryFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new DeliveryFactory();
        }
      }
    }
    return instance;
  }

  public IDelivery delivery() {
    return this.delivery;
  }

}
