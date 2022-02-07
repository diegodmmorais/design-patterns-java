package com.lukeware.observer.controller;

import com.lukeware.observer.entity.action.IAction;
import com.lukeware.observer.entity.proposal.IProposal;

import java.util.Set;

/**
 * @author Diego Morais
 */
public interface IRuleController {
  Set<IAction> runBusinessRulesFour(IProposal proposal);
}
