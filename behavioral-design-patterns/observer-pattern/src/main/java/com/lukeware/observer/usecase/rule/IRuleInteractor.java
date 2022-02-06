package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.entity.proposal.IProposal;

/**
 * @author diegomorais
 */
public interface IRuleInteractor {
  boolean runBusinessRulesFour(IProposal proposal);
}
