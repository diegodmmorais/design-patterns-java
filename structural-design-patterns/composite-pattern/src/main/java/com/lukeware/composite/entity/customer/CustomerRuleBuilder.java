package com.lukeware.composite.entity.customer;

import com.lukeware.composite.entity.IRule;

/**
 * @author Diego Morais
 */
public class CustomerRuleBuilder {
  private String name;

  private CustomerRuleBuilder() {
    super();
  }

  public static CustomerRuleBuilder builder() {
    return new CustomerRuleBuilder();
  }

  public CustomerRuleBuilder name(String name) {
    this.name = name;
    return this;
  }

  public IRule build() {
    return new CustomerRule(this.name);
  }

}
