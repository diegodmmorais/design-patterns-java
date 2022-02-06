package com.lukeware.composite.usacase.product;

import com.lukeware.composite.usacase.IRule;

/**
 * @author Diego Morais
 */
final record ProductRule(String name) implements IRule {
  @Override
  public void run() {
    System.out.println(String.format("Run product rule %s ...", name));
  }
}
