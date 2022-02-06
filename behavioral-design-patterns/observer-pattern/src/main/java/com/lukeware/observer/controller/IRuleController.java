package com.lukeware.observer.controller;

import com.lukeware.observer.entity.proposal.IProposal;

/**
 * @author Diego Morais
 */
public interface IRuleController {
  boolean runBusinessRulesFour(IProposal proposal);
}
