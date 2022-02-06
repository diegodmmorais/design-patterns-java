package com.lukeware.composite.usacase;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Diego Morais
 */
final class RulesGroup implements IRulesGroup {

  private final Set<IRule> rules = new LinkedHashSet<>();

  public void add(IRule rule) {
    this.rules.add(rule);
  }

  public void remove(IRule rule) {
    this.rules.remove(rule);
  }

  @Override
  public void run() {
    this.rules.forEach(rule -> rule.run());
  }

  @Override
  public String name() {
    return "rule-main";
  }
}
