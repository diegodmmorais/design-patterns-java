package com.lukeware.observer.usecase.rule.group;

import com.lukeware.observer.usecase.IRuleRunner;

/**
 * @author Diego Morais
 */
public interface IRuleGroupRunner extends IRuleRunner {

  void add(IRuleRunner rule);

  void remove(IRuleRunner rule);

  void executeMulti();
}
