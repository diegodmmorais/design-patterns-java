package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.entity.action.IAction;
import com.lukeware.observer.entity.action.TypeAction;
import com.lukeware.observer.entity.proposal.IProposal;
import com.lukeware.observer.usecase.AbstractFactoryProvider;
import com.lukeware.observer.usecase.IRuleRunner;
import com.lukeware.observer.usecase.rule.event.EventListenRules;
import com.lukeware.observer.usecase.rule.event.RuleEventManager;
import com.lukeware.observer.usecase.rule.group.RuleGroupBuilder;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * @author diegomorais
 */
final class RuleInteractor implements IRuleInteractor, EventListenRules {

  private final RuleEventManager eventManager;
  private Set<IAction> rulesRunning;

  RuleInteractor() {
    super();
    this.eventManager = RuleEventManager.getInstance();
    this.rulesRunning = new LinkedHashSet<>();
  }

  @Override
  public void update(Set<IAction> actions) {
    this.rulesRunning.addAll(actions);
  }

  @Override
  public Set<IAction> runBusinessRulesFour(IProposal proposal) throws ExecutionException, InterruptedException {

    final var identifierProposal = proposal.identifierCode();
    eventManager.subscribe(identifierProposal, this);

    final var ruleMotoFour = RuleGroupBuilder.builder().build();
    ruleMotoFour.addAll(getRuleRunner(proposal));

    ruleMotoFour.executeMulti();
    eventManager.unsubscribe(identifierProposal);

    return getAction(TypeAction.APPROVED);
  }

  private Set<IAction> getAction(TypeAction type) {
    return this.rulesRunning.stream().filter(it -> type.equals(it.type())).collect(Collectors.toSet());
  }

  private Set<IRuleRunner> getRuleRunner(final IProposal proposal) {
    return AbstractFactoryProvider.getInstance()
                                  .createAll()
                                  .stream().map(factory -> (IRuleRunner) factory.create(proposal))
                                  .collect(Collectors.toSet());
  }


}
