package com.lukeware.composite.entity.customer;

import com.lukeware.composite.entity.IRule;

/**
 * @author Diego Morais
 */
final record CustomerRule(String name) implements IRule {

  @Override
  public void run() {
    System.out.println(String.format("Run customer rules %s ...", name));
  }
}
