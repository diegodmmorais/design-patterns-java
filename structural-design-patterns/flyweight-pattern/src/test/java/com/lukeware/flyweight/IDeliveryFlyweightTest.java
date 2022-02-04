package com.lukeware.flyweight;

import com.lukeware.flyweight.entity.DeliveryFactory;
import com.lukeware.flyweight.entity.DeliveryLocationDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("delivery test")
class IDeliveryFlyweightTest {

  @Test
  @DisplayName("run delivery")
  void runDelivery() {
    final var locationData = DeliveryLocationDataBuilder.builder().cyte("new york").street("0001-123").build();
    final var locationData2 = DeliveryLocationDataBuilder.builder().cyte("L.A").street("0001-784").build();

    final var delivery = DeliveryFactory.getInstance().delivery();

    delivery.makeLocation(locationData).delivery("Diego Morais", "393");
    delivery.makeLocation(locationData).delivery("Jonh Davi", "758");
    delivery.makeLocation(locationData2).delivery("Jonh Davi", "758");

    Assertions.assertFalse(delivery.getLocations().entrySet().isEmpty(), "Location is not empty");
    Assertions.assertTrue(delivery.getLocations().entrySet().stream().findFirst().isPresent(), "Location is present");

  }

}