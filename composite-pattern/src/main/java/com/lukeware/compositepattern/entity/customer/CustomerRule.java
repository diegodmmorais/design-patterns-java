package com.lukeware.compositepattern.entity.customer;

import com.lukeware.compositepattern.entity.IRule;

/**
 * @author Diego Morais
 */
final record CustomerRule(String name) implements IRule {

  @Override
  public void run() {
    System.out.println(String.format("Run customer rules %s ...", name));
  }
}
