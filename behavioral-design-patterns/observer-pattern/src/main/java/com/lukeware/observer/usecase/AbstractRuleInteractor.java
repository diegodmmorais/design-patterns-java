package com.lukeware.observer.usecase;

import com.lukeware.observer.entity.action.IAction;

import java.util.Set;

/**
 * @author Diego Morais
 */
public abstract class AbstractRuleInteractor {

  private final Set<IAction> actions;

  protected AbstractRuleInteractor(Set<IAction> actions) {
    this.actions = actions;
  }

  public Set<IAction> actions() {
    return actions;
  }
}
