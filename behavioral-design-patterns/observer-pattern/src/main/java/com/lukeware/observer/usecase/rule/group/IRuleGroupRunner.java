package com.lukeware.observer.usecase.rule.group;

import com.lukeware.observer.usecase.IRuleRunner;

import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * @author Diego Morais
 */
public interface IRuleGroupRunner extends IRuleRunner {

  void add(IRuleRunner rule);

  void remove(IRuleRunner rule);

  void executeMulti() throws ExecutionException, InterruptedException;

  void addAll(Set<IRuleRunner> ruleRunner);
}
