package com.lukeware.composite.entity.product;

import com.lukeware.composite.entity.IRule;

/**
 * @author Diego Morais
 */
final record ProductRule(String name) implements IRule {
  @Override
  public void run() {
    System.out.println(String.format("Run product rule %s ...", name));
  }
}
