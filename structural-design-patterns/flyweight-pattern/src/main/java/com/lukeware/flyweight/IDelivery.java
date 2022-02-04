package com.lukeware.flyweight;

import java.util.Map;

/**
 * @author Diego Morais
 */
public interface IDelivery {
  IDeliveryFlyweight makeLocation(IDeliveryLocationData locationData);

  Map<String, IDeliveryFlyweight> getLocations();
}
