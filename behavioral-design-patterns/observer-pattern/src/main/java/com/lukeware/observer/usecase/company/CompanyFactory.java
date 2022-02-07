package com.lukeware.observer.usecase.company;

import com.lukeware.observer.entity.proposal.IProposal;
import com.lukeware.observer.usecase.IRuleFactory;

import java.util.Objects;

/**
 * @author diegomorais
 */
public final class CompanyFactory implements IRuleFactory<IProposal, IRuleCompany> {

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
  public IRuleCompany create(IProposal proposal) {
    return new CompanyInteractor(proposal.identifierCode(), proposal.comapny());
  }

}
