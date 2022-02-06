package com.lukeware.observer.usecase.representative;

import com.lukeware.observer.entity.representative.IRepresentative;

import java.util.Objects;

/**
 * @author
 */
final record RepresentativeInteractor(IRepresentative representative) implements IRuleRepresentative {

  @Override
  public void execute() {
    System.out.println("----------------------------------------");
    System.out.println("| Running rules representative");
    if (Objects.nonNull(representative.identifierDocument())) {
      System.out.println("| Identifier document validated");
    }
    System.out.println("| " + representative);
    System.out.println("----------------------------------------\n");
  }

}
