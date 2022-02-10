package com.lukeware.observer.usecase.company;

import com.lukeware.observer.entity.action.ActionBuilder;
import com.lukeware.observer.entity.action.TypeAction;
import com.lukeware.observer.entity.company.IComapny;
import com.lukeware.observer.usecase.AbstractRuleInteractor;
import com.lukeware.observer.usecase.rule.event.RuleEventManager;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author
 */
final class CompanyInteractor extends AbstractRuleInteractor implements IRuleCompany {

  private final IComapny comapny;
  private final RuleEventManager eventManager;
  private final String identifierProposal;


  CompanyInteractor(String identifierProposal, IComapny comapny) {
    super(new LinkedHashSet<>());
    this.comapny = comapny;
    this.eventManager = RuleEventManager.getInstance();
    this.identifierProposal = identifierProposal;
  }

  @Override
  public void execute() {
    System.out.println("\n----------------------------------------");
    System.out.println("| Running rules company");
    if (Objects.nonNull(comapny.identifierDocument())) {
      System.out.println("| Identifier document validated");
      actions().add(ActionBuilder.builder()
                                 .action("VALIDATE_IDENTIFIER_DOCUMENT_COMPANY " + this.identifierProposal)
                                 .type(TypeAction.APPROVED)
                                 .build());
      eventManager.notify(identifierProposal, this.actions());
    }
    System.out.println("| " + comapny);
    System.out.println("----------------------------------------\n");
  }

}
