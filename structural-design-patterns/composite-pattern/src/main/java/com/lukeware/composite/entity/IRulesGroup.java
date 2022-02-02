package com.lukeware.composite.entity;

/**
 * @author Diego Morais
 */
public interface IRulesGroup extends IRule {
  void add(IRule rule);

  void remove(IRule rule);
}
