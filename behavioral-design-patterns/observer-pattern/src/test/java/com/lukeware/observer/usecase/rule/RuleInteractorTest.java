package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.entity.action.TypeAction;
import com.lukeware.observer.entity.company.CompanyBuilder;
import com.lukeware.observer.entity.proposal.ProposalBuilder;
import com.lukeware.observer.entity.representative.RepresentativeBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Rule interactor test")
class RuleInteractorTest {


  @Test
  @DisplayName("Run business rules four")
  void runBusinessRulesFour() {

    final var ruleInteractor = new RuleInteractor();

    final var comapny = CompanyBuilder.builder()
                                      .data("data")
                                      .idenfierDocument("99.999.99/9999-99")
                                      .build();

    final var representative = RepresentativeBuilder.builder()
                                                    .identifierDocument("999.999.999-99")
                                                    .firstName("Jonh")
                                                    .lastName("Dave")
                                                    .build();
    final var proposal = ProposalBuilder.builder()
                                        .identifierCode("99991111222333")
                                        .comapny(comapny)
                                        .representative(representative)
                                        .build();

    final var action = ruleInteractor.runBusinessRulesFour(proposal);

    Assertions.assertNotNull(action);
    Assertions.assertFalse(action.isEmpty());
    Assertions.assertEquals(TypeAction.GO_TO_AGENCY, action.stream().findFirst().get().type());

  }

}