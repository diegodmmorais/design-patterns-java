package com.lukeware.composite.usacase.company;

import com.lukeware.composite.usacase.IRule;

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
