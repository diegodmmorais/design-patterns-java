package com.lukeware.adapterpattern.entity;

import com.lukeware.adapterpattern.ILengthAdapter;

import java.util.Objects;

/**
 * @author Diego Morais
 */
public final class LengthFactory {

  private static LengthFactory instance;

  private LengthFactory() {
    super();
  }

  public static LengthFactory getInstance() {
    if (Objects.isNull(LengthFactory.instance)) {
      synchronized (LengthFactory.class) {
        if (Objects.isNull(LengthFactory.instance)) {
          LengthFactory.instance = new LengthFactory();
        }
      }
    }
    return instance;
  }

  public ILengthAdapter create() {
    return new LengthAdapter();
  }

  public ILengthAdapter create(double measurement) {
    return new LengthAdapter(measurement);
  }
}
