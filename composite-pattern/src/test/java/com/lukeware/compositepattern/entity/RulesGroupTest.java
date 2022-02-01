package com.lukeware.compositepattern.entity;

import com.lukeware.compositepattern.entity.company.CompanyRuleBuilder;
import com.lukeware.compositepattern.entity.customer.CustomerRuleBuilder;
import com.lukeware.compositepattern.entity.product.ProductRuleBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Rules group test")
class RulesGroupTest {

  @Test
  @DisplayName("Run Rules")
  void runRules() {

    final var group1 = RuleGroupFactory.getInstance().create();

    final var companyRule = CompanyRuleBuilder.builder().name("company-rule-1").build();
    final var customerRule = CustomerRuleBuilder.builder().name("customer-rule-1").build();
    final var productRule = ProductRuleBuilder.builder().name("product-rule-1").build();

    group1.add(companyRule);
    group1.add(productRule);
    group1.add(customerRule);

    final var group2 = RuleGroupFactory.getInstance().create();

    final var companyRule2 = CompanyRuleBuilder.builder().name("company-rule-2").build();
    final var customerRule2 = CustomerRuleBuilder.builder().name("customer-rule-2").build();
    final var productRule2 = ProductRuleBuilder.builder().name("product-rule-2").build();

    group2.add(companyRule2);
    group2.add(customerRule2);
    group2.add(productRule2);

    group1.add(group2);

    System.out.println("=======================================");
    Assertions.assertDoesNotThrow(() -> group1.run());
    group2.remove(companyRule2);

    System.out.println("\n=======================================");
    Assertions.assertDoesNotThrow(() -> group1.run());
    Assertions.assertEquals("rule-main", group2.name());

    System.out.println("\n=======================================");


  }

}