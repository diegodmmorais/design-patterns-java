package com.lukeware.observer.usecase.rule.event;

import com.lukeware.observer.entity.action.IAction;
import com.lukeware.observer.usecase.RuleType;

import java.util.Set;

/**
 * @author Diego Morais
 */
public interface EventListenRules {
  void update(RuleType type, Set<IAction> actions);
}
