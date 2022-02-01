package com.lukeware.compositepattern.entity;

import java.util.Set;

/**
 * @author Diego Morais
 */
public interface IRulesGroup extends IRule {
  void add(IRule rule);

  void remove(IRule rule);
}
