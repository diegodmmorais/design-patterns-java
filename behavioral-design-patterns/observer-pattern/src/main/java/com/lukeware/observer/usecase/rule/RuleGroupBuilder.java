package com.lukeware.observer.usecase.rule;

/**
 * @author Diego Morais
 */
public final class RuleGroupBuilder {


  private RuleGroupBuilder() {
    super();
  }

  public static RuleGroupBuilder builder() {
    return new RuleGroupBuilder();
  }

  public IRuleGroupRunner build() {
    return new RuleGroupRunner();
  }


}
