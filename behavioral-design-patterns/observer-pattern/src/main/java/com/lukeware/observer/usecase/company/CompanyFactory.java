package com.lukeware.observer.usecase.company;

import com.lukeware.observer.entity.company.IComapny;
import com.lukeware.observer.usecase.IRuleFactory;

import java.util.Objects;

/**
 * @author diegomorais
 */
public final class CompanyFactory implements IRuleFactory<IComapny, IRuleCompany> {

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

  @Override
  public IRuleCompany create(IComapny comapny) {
    return new CompanyInteractor(comapny);
  }

}
