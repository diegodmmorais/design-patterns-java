package com.lukeware.observer.usecase.company;

import com.lukeware.observer.entity.company.IComapny;

import java.util.Objects;

/**
 * @author
 */
final record CompanyInteractor(IComapny comapny) implements IRuleCompany {

  @Override
  public void execute() {
    System.out.println("\n----------------------------------------");
    System.out.println("| Running rules company");
    if (Objects.nonNull(comapny.identifierDocument())) {
      System.out.println("| Identifier document validated");
    }
    System.out.println("| " + comapny);
    System.out.println("----------------------------------------\n");
  }
}
