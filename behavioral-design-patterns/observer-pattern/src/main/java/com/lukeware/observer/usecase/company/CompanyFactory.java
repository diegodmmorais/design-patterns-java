package com.lukeware.observer.usecase.company;

import java.util.Objects;

/**
 * @author diegomorais
 */
public final class CompanyFactory {

  private static CompanyFactory instance;

  private CompanyFactory() {
    super();
  }

  public static CompanyFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (CompanyFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new CompanyFactory();
        }
      }
    }

    return instance;
  }

  public IComapnyInputBoundary create(){
    return  CompanyInteractor.getInstance();
  }

}
