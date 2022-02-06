package com.lukeware.observer.usecase;

/**
 * @author diegomorais
 */
public interface IRuleEnforcer<T> {
  void execute(T t);
}
