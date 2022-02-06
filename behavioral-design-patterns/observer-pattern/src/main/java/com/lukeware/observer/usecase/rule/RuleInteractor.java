package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.entity.proposal.IProposal;

/**
 * @author diegomorais
 */
final record RuleInteractor() implements IRuleInteractor {

  @Override
  public boolean runBusinessRulesFour(IProposal proposal) {


    return false;
  }
}
