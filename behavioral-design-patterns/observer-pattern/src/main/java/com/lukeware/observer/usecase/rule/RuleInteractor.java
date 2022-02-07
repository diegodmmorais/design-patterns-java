package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.entity.action.IAction;
import com.lukeware.observer.entity.proposal.IProposal;
import com.lukeware.observer.usecase.AbstractFactoryProvider;
import com.lukeware.observer.usecase.FactoryType;
import com.lukeware.observer.usecase.IRuleRunner;
import com.lukeware.observer.usecase.RuleType;
import com.lukeware.observer.usecase.rule.event.EventListenRules;
import com.lukeware.observer.usecase.rule.event.RuleEventManager;
import com.lukeware.observer.usecase.rule.group.RuleGroupBuilder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author diegomorais
 */
final class RuleInteractor implements IRuleInteractor, EventListenRules {

  private Map<RuleType, Set<IAction>> actions = new LinkedHashMap<>();

  @Override
  public boolean runBusinessRulesFour(IProposal proposal) {

    final var eventManager = RuleEventManager.getInstance();
    eventManager.subscribe(this, RuleType.COMPANY, RuleType.REPRESENTATIVE);

    final var companyFactory = AbstractFactoryProvider.getInstance().create(FactoryType.COMPANY);
    final var companyRule = (IRuleRunner) companyFactory.create(proposal.comapny());

    final var representantiveFactory = AbstractFactoryProvider.getInstance().create(FactoryType.REPRESENTATIVE );
    final var representantiveRule = (IRuleRunner) representantiveFactory.create(proposal.representative());

    final var groupRunnerRule = RuleGroupBuilder.builder().build();
    groupRunnerRule.add(companyRule);
    groupRunnerRule.add(representantiveRule);

    groupRunnerRule.executeMulti();

    System.out.println("| " + this.actions);

    return false;
  }

  private boolean isValid() {

    return false;
  }

  @Override
  public void update(RuleType type, Set<IAction> actions) {
    this.actions.put(type, actions);
  }
}
