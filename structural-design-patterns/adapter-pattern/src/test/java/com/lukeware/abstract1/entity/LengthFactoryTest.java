package com.lukeware.abstract1.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Length factory test")
class LengthFactoryTest {

  @Test
  @DisplayName("1 - create length adapter")
  void create() {

    final var lengthAdapter = LengthFactory.getInstance().create();

    final var centimeter = lengthAdapter.getCentimeter();
    final var meter = lengthAdapter.getMeter();
    final var kilometer = lengthAdapter.getKilometer();

    Assertions.assertEquals(1, centimeter.value());
    Assertions.assertEquals(Type.CENTIMETER, centimeter.type());

    Assertions.assertEquals(0.01, meter.value());
    Assertions.assertEquals(Type.METERS, meter.type());

    Assertions.assertEquals(1.0E-5, kilometer.value());
    Assertions.assertEquals(Type.KILOMETER, kilometer.type());

  }

  @Test
  @DisplayName("2 - create length adapter with measurement")
  void createLengthAdapterWithMeasurement() {

    final var lengthAdapter = LengthFactory.getInstance().create(100);

    final var centimeter = lengthAdapter.getCentimeter();
    final var meter = lengthAdapter.getMeter();
    final var kilometer = lengthAdapter.getKilometer();

    Assertions.assertEquals(100, centimeter.value());
    Assertions.assertEquals(Type.CENTIMETER, centimeter.type());

    Assertions.assertEquals(1, meter.value());
    Assertions.assertEquals(Type.METERS, meter.type());

    Assertions.assertEquals(0.001, kilometer.value());
    Assertions.assertEquals(Type.KILOMETER, kilometer.type());

  }

  @Test
  @DisplayName("3 - create length adapter with measurement 100000")
  void createLengthAdapterWithMeasurement1000() {

    final var lengthAdapter = LengthFactory.getInstance().create(100000);

    final var centimeter = lengthAdapter.getCentimeter();
    final var meter = lengthAdapter.getMeter();
    final var kilometer = lengthAdapter.getKilometer();

    Assertions.assertEquals(100000, centimeter.value());
    Assertions.assertEquals(Type.CENTIMETER, centimeter.type());

    Assertions.assertEquals(1000, meter.value());
    Assertions.assertEquals(Type.METERS, meter.type());

    Assertions.assertEquals(1, kilometer.value());
    Assertions.assertEquals(Type.KILOMETER, kilometer.type());

  }
}