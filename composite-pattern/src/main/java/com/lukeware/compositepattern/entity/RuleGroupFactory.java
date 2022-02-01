package com.lukeware.compositepattern.entity;

import java.util.Objects;

/**
 * @author Diego Morais
 */
public final class RuleGroupFactory {
  private static RuleGroupFactory instance;

  private RuleGroupFactory() {
    super();
  }

  public static RuleGroupFactory getInstance() {
    if (Objects.isNull(RuleGroupFactory.instance)) {
      synchronized (RuleGroupFactory.class) {
        if (Objects.isNull(RuleGroupFactory.instance)) {
          RuleGroupFactory.instance = new RuleGroupFactory();
        }
      }
    }
    return instance;
  }

  public IRulesGroup create() {
    return new RulesGroup();
  }
}
