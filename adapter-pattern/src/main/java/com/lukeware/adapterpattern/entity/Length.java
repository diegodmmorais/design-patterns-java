package com.lukeware.adapterpattern.entity;

/**
 * @author Diego Morais
 */
class Length implements ILength {
  private final double measurement;

  Length(double measurement) {
    super();
    this.measurement = measurement;
  }

  @Override
  public Measurement getMeasurement() {
    return new Measurement(measurement, Type.CENTIMETER);
  }

}
