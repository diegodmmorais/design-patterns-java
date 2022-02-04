package com.lukeware.flyweight.entity;

import java.util.Objects;

/**
 * @author Diego Morais
 */
public final class DeliveryLocationDataBuilder {
  private String zipCode;
  private String cyte;

  private static DeliveryLocationDataBuilder deliveryLocationDataBuilder;

  private DeliveryLocationDataBuilder() {
    super();
  }

  public static DeliveryLocationDataBuilder builder() {
    if (Objects.isNull(deliveryLocationDataBuilder)) {
      synchronized (DeliveryLocationDataBuilder.class) {
        if (Objects.isNull(deliveryLocationDataBuilder)) {
          deliveryLocationDataBuilder = new DeliveryLocationDataBuilder();
        }
      }
    }
    return deliveryLocationDataBuilder;
  }

  public DeliveryLocationDataBuilder street(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }


  public DeliveryLocationDataBuilder cyte(String cyte) {
    this.cyte = cyte;
    return this;
  }

  public DeliveryLocationData build() {
    return new DeliveryLocationData(this.zipCode, this.cyte);
  }

}
