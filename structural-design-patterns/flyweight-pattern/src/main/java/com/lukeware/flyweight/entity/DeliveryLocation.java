package com.lukeware.flyweight.entity;

import com.lukeware.flyweight.IDeliveryFlyweight;
import com.lukeware.flyweight.IDeliveryLocationData;

/**
 * @author Diego Morais
 */
final record DeliveryLocation(IDeliveryLocationData intrinsicState) implements IDeliveryFlyweight {

  @Override
  public void delivery(String name, String number) {
    System.out.println(String.format("\nDelivery for %s, with number %s.", name, number));
    System.out.println(String.format("Delivery in %s, in the zipCode %s\n", this.intrinsicState.cyte(), this.intrinsicState.zipCode()));
  }

}
