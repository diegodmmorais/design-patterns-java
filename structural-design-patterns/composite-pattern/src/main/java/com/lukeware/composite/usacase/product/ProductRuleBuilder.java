package com.lukeware.composite.usacase.product;

import com.lukeware.composite.usacase.IRule;

/**
 * @author Diego Morais
 */
public class ProductRuleBuilder {
  private String name;

  private ProductRuleBuilder() {
    super();
  }

  public static ProductRuleBuilder builder() {
    return new ProductRuleBuilder();
  }

  public ProductRuleBuilder name(String name) {
    this.name = name;
    return this;
  }

  public IRule build() {
    return new ProductRule(this.name);
  }
}
