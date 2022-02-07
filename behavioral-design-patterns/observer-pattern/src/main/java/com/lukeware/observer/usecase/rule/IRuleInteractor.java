package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.entity.action.IAction;
import com.lukeware.observer.entity.proposal.IProposal;

import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * @author diegomorais
 */
public interface IRuleInteractor {
  Set<IAction> runBusinessRulesFour(IProposal proposal) throws ExecutionException, InterruptedException;
}
