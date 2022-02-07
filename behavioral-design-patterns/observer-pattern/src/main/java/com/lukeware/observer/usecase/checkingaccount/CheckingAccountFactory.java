package com.lukeware.observer.usecase.checkingaccount;

import com.lukeware.observer.entity.proposal.IProposal;
import com.lukeware.observer.usecase.IRuleFactory;

import java.util.Objects;

/**
 * @author diegomorais
 */
public final class CheckingAccountFactory implements IRuleFactory<IProposal, IRuleCheckingAccount> {

  private static CheckingAccountFactory instance;

  private CheckingAccountFactory() {
    super();
  }

  public static CheckingAccountFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (CheckingAccountFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new CheckingAccountFactory();
        }
      }
    }
    return instance;
  }

  @Override
  public IRuleCheckingAccount create(IProposal proposal) {
    return new CheckingAccountInteractor(proposal.identifierCode(), proposal.checkingAccount());
  }

}
