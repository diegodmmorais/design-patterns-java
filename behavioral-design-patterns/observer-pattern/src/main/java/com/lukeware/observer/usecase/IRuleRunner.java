package com.lukeware.observer.usecase;

import com.lukeware.observer.entity.action.IAction;

import java.util.Set;

/**
 * @author diegomorais
 */
public interface IRuleRunner {
  void execute();

  Set<IAction> actions();
}
