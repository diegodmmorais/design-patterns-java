package com.lukeware.observer.usecase.representative;

import java.util.Objects;

/**
 * @author diegomorais
 */
public final class RepresentativeFactory {

  private static RepresentativeFactory instance;

  private RepresentativeFactory() {
    super();
  }

  public static RepresentativeFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (RepresentativeFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new RepresentativeFactory();
        }
      }
    }

    return instance;
  }

  public IRepresentantiveInputBoundary create() {
    return RepresentativeInteractor.getInstance();
  }

}
