package com.lukeware.observer.usecase.company;

import com.lukeware.observer.entity.company.IComapny;

import java.util.Objects;

/**
 * @author
 */
final record CompanyInteractor() implements IComapnyInputBoundary {

  private static CompanyInteractor instance;

  public static CompanyInteractor getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (CompanyInteractor.class) {
        if (Objects.isNull(instance)) {
          instance = new CompanyInteractor();
        }
      }
    }
    return instance;
  }

  @Override
  public void execute(IComapny comapny) {
    System.out.println("Running rules company");
    if (Objects.nonNull(comapny.identifierDocument())) {
      System.out.println("Identifier code validated");
    }
    System.out.println(comapny);
  }
}
