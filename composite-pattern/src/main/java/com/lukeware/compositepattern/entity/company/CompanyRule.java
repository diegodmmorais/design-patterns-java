package com.lukeware.compositepattern.entity.company;

import com.lukeware.compositepattern.entity.IRule;

/**
 * @author Diego Morais
 */
final record CompanyRule(String name) implements IRule {
  @Override
  public void run() {
    System.out.println(String.format("Run company rules %s ...", name));
  }
}
