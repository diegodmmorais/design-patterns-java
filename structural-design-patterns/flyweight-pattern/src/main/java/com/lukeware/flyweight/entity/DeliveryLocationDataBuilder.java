package com.lukeware.flyweight.entity;

/**
 * @author Diego Morais
 */
public final class DeliveryLocationDataBuilder {
  private String zipCode;
  private String cyte;

  private DeliveryLocationDataBuilder() {
    super();
  }

  public static DeliveryLocationDataBuilder builder() {
    return new DeliveryLocationDataBuilder();
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
