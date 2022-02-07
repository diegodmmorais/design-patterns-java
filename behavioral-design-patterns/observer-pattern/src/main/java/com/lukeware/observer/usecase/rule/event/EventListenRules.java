package com.lukeware.observer.usecase.rule.event;

import com.lukeware.observer.entity.action.IAction;

import java.util.Set;

/**
 * @author Diego Morais
 */
public interface EventListenRules {
  void update(Set<IAction> actions);
}
