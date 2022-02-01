package com.lukeware.compositepattern.entity.product;

import com.lukeware.compositepattern.entity.IRule;

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
