package com.lukeware.observer.usecase;

import com.lukeware.observer.entity.company.CompanyBuilder;
import com.lukeware.observer.entity.representative.RepresentativeBuilder;
import com.lukeware.observer.usecase.rule.RuleGroupBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Rule runner test")
class IRuleRunnerTest {

  @Test
  @DisplayName("rule runner")
  void ruleRunner() {
    final var motorFour = RuleGroupBuilder.builder().build();

    final var company = CompanyBuilder.builder().data("Informations").idenfierDocument("99.999.99/9999-99").build();
    final var representative = RepresentativeBuilder.builder()
                                                    .identifierDocument("999.999.999.99")
                                                    .firstName("Jonh")
                                                    .lastName("Dave")
                                                    .build();

    final var companyFactory = AbstractFactoryProvider.getInstance().create(FactoryType.COMPANY);
    final var representativeFactory = AbstractFactoryProvider.getInstance().create(FactoryType.REPRESENTATIVE);

    final var ruleCompany = (IRuleRunner) companyFactory.create(company);
    final var ruleRepresentative = (IRuleRunner) representativeFactory.create(representative);

    motorFour.add(ruleCompany);
    motorFour.add(ruleRepresentative);

    Assertions.assertDoesNotThrow(() -> motorFour.execute());


    motorFour.remove(ruleCompany);
    Assertions.assertDoesNotThrow(() -> motorFour.execute());

  }


}