package com.lukeware.compositepattern.entity.company;

import com.lukeware.compositepattern.entity.IRule;

/**
 * @author Diego Morais
 */
public class CompanyRuleBuilder {

  private String name;

  private CompanyRuleBuilder() {
    super();
  }

  public static CompanyRuleBuilder builder() {
    return new CompanyRuleBuilder();
  }

  public CompanyRuleBuilder name(String name) {
    this.name = name;
    return this;
  }

  public IRule build() {
    return new CompanyRule(this.name);
  }

}
