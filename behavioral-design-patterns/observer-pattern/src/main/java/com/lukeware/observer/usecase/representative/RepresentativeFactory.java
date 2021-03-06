package com.lukeware.observer.usecase.representative;

import com.lukeware.observer.entity.proposal.IProposal;
import com.lukeware.observer.usecase.IRuleFactory;

import java.util.Objects;

/**
 * @author diegomorais
 */
public final class RepresentativeFactory implements IRuleFactory<IProposal, IRuleRepresentative> {

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

  @Override
  public IRuleRepresentative create(IProposal proposal) {
    return new RepresentativeInteractor(proposal.identifierCode(), proposal.representative());
  }

}
