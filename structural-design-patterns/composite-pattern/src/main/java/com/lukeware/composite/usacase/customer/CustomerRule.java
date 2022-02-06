package com.lukeware.composite.usacase.customer;

import com.lukeware.composite.usacase.IRule;

/**
 * @author Diego Morais
 */
final record CustomerRule(String name) implements IRule {

  @Override
  public void run() {
    System.out.println(String.format("Run accountowner rules %s ...", name));
  }
}
