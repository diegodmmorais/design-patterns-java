package com.lukeware.adapterpattern.entity;

import com.lukeware.adapterpattern.ILengthAdapter;
import com.lukeware.adapterpattern.IMeasurement;

/**
 * @author Diego Morais
 */
final class LengthAdapter extends Length implements ILengthAdapter {

  LengthAdapter() {
    super(1.0);
  }

  LengthAdapter(double measurement) {
    super(measurement);
  }

  @Override
  public IMeasurement getCentimeter() {
    return getMeasurement();
  }

  @Override
  public IMeasurement getMeter() {
    final var measurement = getMeasurement();
    final var value = measurement.value() / 100;
    return new Measurement(value, Type.METERS);
  }

  @Override
  public IMeasurement getKilometer() {
    final var measurement = getMeter();
    final var value = measurement.value() / 1000;
    return new Measurement(value, Type.KILOMETER);
  }

}
