package com.lukeware.observer.usecase.rule.group;

import com.lukeware.observer.usecase.AbstractRuleInteractor;
import com.lukeware.observer.usecase.IRuleRunner;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * @author diegomorais
 */
class RuleGroupRunner extends AbstractRuleInteractor implements IRuleGroupRunner {

  private Set<IRuleRunner> rules = new LinkedHashSet<>();

  protected RuleGroupRunner() {
    super(new LinkedHashSet<>());
  }

  @Override
  public void execute() {
    rules.forEach(rule -> rule.execute());
  }

  @Override
  public void add(IRuleRunner rule) {
    rules.add(rule);
  }

  @Override
  public void remove(IRuleRunner rule) {
    rules.remove(rule);
  }

  @Override
  public void executeMulti() {

    final var futures = rules.stream()
                             .map(it -> CompletableFuture.runAsync(() -> it.execute()))
                             .collect(Collectors.toSet());

    CompletableFuture<Void> all = CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]));

    try {
      all.get();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

  }
}
