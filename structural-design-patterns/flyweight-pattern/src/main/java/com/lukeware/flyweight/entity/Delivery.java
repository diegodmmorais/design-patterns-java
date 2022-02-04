package com.lukeware.flyweight.entity;

import com.lukeware.flyweight.IDelivery;
import com.lukeware.flyweight.IDeliveryFlyweight;
import com.lukeware.flyweight.IDeliveryLocationData;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Diego Morais
 */
final class Delivery implements IDelivery {

  private Map<String, IDeliveryFlyweight> locations = new LinkedHashMap<>();

  private String createId(IDeliveryLocationData locationData) {
    final var street = locationData.zipCode().replaceAll("\s+", "");
    final var cyte = locationData.cyte().replaceAll("\s+", "");
    return String.format("%s%s", street, cyte);
  }

  @Override
  public IDeliveryFlyweight makeLocation(IDeliveryLocationData locationData) {
    String id = this.createId(locationData);
    final var optLocation = this.locations.entrySet().stream().filter(it -> it.getKey().equals(id)).findFirst();
    if (optLocation.isPresent()) {
      return locations.get(id);
    }
    locations.put(id, new DeliveryLocation(locationData));
    return locations.get(id);
  }

  @Override
  public Map<String, IDeliveryFlyweight> getLocations() {
    return locations;
  }
}
