package com.lukeware.observer.usecase.representative;

import com.lukeware.observer.entity.representative.IRepresentative;

import java.util.Objects;

/**
 * @author
 */
final record RepresentativeInteractor() implements IRepresentantiveInputBoundary {

  private static RepresentativeInteractor instance;

  public static RepresentativeInteractor getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (RepresentativeInteractor.class) {
        if (Objects.isNull(instance)) {
          instance = new RepresentativeInteractor();
        }
      }
    }
    return instance;
  }

  @Override
  public void execute(IRepresentative representative) {
    System.out.println("Running rules representative");
    if (Objects.nonNull(representative.identifierDocument())) {
      System.out.println("Identifier code validated");
    }
    System.out.println(representative);

  }
}
