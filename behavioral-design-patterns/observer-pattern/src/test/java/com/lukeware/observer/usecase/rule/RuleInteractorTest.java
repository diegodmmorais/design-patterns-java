package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.entity.action.TypeAction;
import com.lukeware.observer.entity.checkingaccount.CheckingAccountBuilder;
import com.lukeware.observer.entity.company.CompanyBuilder;
import com.lukeware.observer.entity.proposal.ProposalBuilder;
import com.lukeware.observer.entity.representative.RepresentativeBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

/**
 * @author Diego Morais
 */
@DisplayName("Rule interactor test")
class RuleInteractorTest {


  @Test
  @DisplayName("Run business rules four")
  void runBusinessRulesFour() throws ExecutionException, InterruptedException {

    final var comapny = CompanyBuilder.builder()
                                      .data("data")
                                      .idenfierDocument("99.999.99/9999-99")
                                      .build();

    final var representative = RepresentativeBuilder.builder()
                                                    .identifierDocument("999.999.999-99")
                                                    .firstName("Jonh")
                                                    .lastName("Dave")
                                                    .build();

    final var checkingAccount = CheckingAccountBuilder.builder()
                                                      .accountOwner(representative)
                                                      .agency("0033")
                                                      .number("006658898")
                                                      .build();

    final var proposal = ProposalBuilder.builder()
                                        .identifierCode("99991111222333")
                                        .comapny(comapny)
                                        .representative(representative)
                                        .checkingAccoun(checkingAccount)
                                        .build();

    final var action = new RuleInteractor().runBusinessRulesFour(proposal);

    Assertions.assertNotNull(action);
    Assertions.assertFalse(action.isEmpty());
    Assertions.assertEquals(TypeAction.APPROVED, action.stream().findFirst().get().type());

  }

  @Test
  @DisplayName("Run business rules four")
  void runBusinessRulesFour2() throws ExecutionException, InterruptedException {

    final var comapny = CompanyBuilder.builder()
                                      .data("data")
                                      .idenfierDocument("99.999.99/9999-99")
                                      .build();

    final var representative = RepresentativeBuilder.builder()
                                                    .identifierDocument("999.999.999-99")
                                                    .firstName("Jonh")
                                                    .lastName("Dave")
                                                    .build();

    final var checkingAccount = CheckingAccountBuilder.builder()
                                                      .accountOwner(representative)
                                                      .agency("0033")
                                                      .number("006658898")
                                                      .build();

    final var proposal = ProposalBuilder.builder()
                                        .identifierCode("99991111222333")
                                        .comapny(comapny)
                                        .representative(representative)
                                        .checkingAccoun(checkingAccount)
                                        .build();

    final var proposal2 = ProposalBuilder.builder()
                                        .identifierCode("99991111222444")
                                        .comapny(comapny)
                                        .representative(representative)
                                        .checkingAccoun(checkingAccount)
                                        .build();

    final var action = new RuleInteractor().runBusinessRulesFour(proposal);
    final var action2 = new RuleInteractor().runBusinessRulesFour(proposal2);

    Assertions.assertNotNull(action);
    Assertions.assertFalse(action.isEmpty());
    Assertions.assertEquals(TypeAction.APPROVED, action.stream().findFirst().get().type());

    Assertions.assertNotNull(action2);
    Assertions.assertFalse(action2.isEmpty());
    Assertions.assertEquals(TypeAction.APPROVED, action2.stream().findFirst().get().type());

  }

}