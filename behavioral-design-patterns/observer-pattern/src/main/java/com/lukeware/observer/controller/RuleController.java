package com.lukeware.observer.controller;

import com.lukeware.observer.entity.action.IAction;
import com.lukeware.observer.entity.proposal.IProposal;
import com.lukeware.observer.usecase.rule.IRuleInteractor;

import java.util.Set;

/**
 * @author Diego Morais
 */
public final record RuleController(IRuleInteractor ruleInteractor) implements IRuleController {

  @Override
  public Set<IAction> runBusinessRulesFour(IProposal proposal) {
    return this.ruleInteractor.runBusinessRulesFour(proposal);
  }

}
