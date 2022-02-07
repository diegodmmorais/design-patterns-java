package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.entity.action.IAction;
import com.lukeware.observer.entity.action.TypeAction;
import com.lukeware.observer.entity.proposal.IProposal;
import com.lukeware.observer.usecase.AbstractFactoryProvider;
import com.lukeware.observer.usecase.FactoryType;
import com.lukeware.observer.usecase.IRuleRunner;
import com.lukeware.observer.usecase.rule.event.EventListenRules;
import com.lukeware.observer.usecase.rule.event.RuleEventManager;
import com.lukeware.observer.usecase.rule.group.RuleGroupBuilder;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author diegomorais
 */
final class RuleInteractor implements IRuleInteractor, EventListenRules {

  private Set<IAction> rulesRunning = new LinkedHashSet<>();

  @Override
  public Set<IAction> runBusinessRulesFour(IProposal proposal) {

    final var identifierProposal = proposal.identifierCode();

    final var eventManager = RuleEventManager.getInstance();
    eventManager.subscribe(identifierProposal, this);

    final var companyFactory = AbstractFactoryProvider.getInstance().create(FactoryType.COMPANY);
    final var representantiveFactory = AbstractFactoryProvider.getInstance().create(FactoryType.REPRESENTATIVE);

    final var companyRule = (IRuleRunner) companyFactory.create(identifierProposal, proposal.comapny());
    final var representantiveRule = (IRuleRunner) representantiveFactory.create(identifierProposal, proposal.representative());

    final var ruleMotoFour = RuleGroupBuilder.builder().build();
    ruleMotoFour.add(companyRule);
    ruleMotoFour.add(representantiveRule);

    ruleMotoFour.execute();
    eventManager.unSubscribe(identifierProposal);

    final var reaprover = getAction(TypeAction.REAPPROVED);
    if (!reaprover.isEmpty()) {
      return reaprover;
    }

    final var goToAgency = getAction(TypeAction.GO_TO_AGENCY);
    if (!goToAgency.isEmpty()) {
      return goToAgency;
    }

    return getAction(TypeAction.APPROVED);
  }

  private Set<IAction> getAction(TypeAction type) {
    return this.rulesRunning.stream().filter(it -> type.equals(it.type())).collect(Collectors.toSet());
  }

  @Override
  public void update(Set<IAction> actions) {
    this.rulesRunning.addAll(actions);
  }
}
