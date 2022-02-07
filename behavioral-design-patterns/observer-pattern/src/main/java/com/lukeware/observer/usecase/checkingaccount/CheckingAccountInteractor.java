package com.lukeware.observer.usecase.checkingaccount;

import com.lukeware.observer.entity.action.ActionBuilder;
import com.lukeware.observer.entity.action.TypeAction;
import com.lukeware.observer.entity.checkingaccount.ICheckingAccount;
import com.lukeware.observer.usecase.AbstractRuleInteractor;
import com.lukeware.observer.usecase.rule.event.RuleEventManager;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author Diego Morais
 */
final class CheckingAccountInteractor extends AbstractRuleInteractor implements IRuleCheckingAccount {


  private final String identifierProposal;
  private final ICheckingAccount checkingAccount;
  private final RuleEventManager eventManager;

  protected CheckingAccountInteractor(String identifierProposal, ICheckingAccount checkingAccount) {
    super(new LinkedHashSet<>());
    this.identifierProposal = identifierProposal;
    this.checkingAccount = checkingAccount;
    this.eventManager = RuleEventManager.getInstance();
  }


  @Override
  public void execute() {
    System.out.println("\n----------------------------------------");
    System.out.println("| Running rules checking account");
    if (Objects.nonNull(checkingAccount.agency())) {
      System.out.println("| Agency validated");
      actions().add(ActionBuilder.builder().action("VALIDATE_AGENCY").type(TypeAction.APPROVED).build());
      eventManager.notify(identifierProposal, this.actions());
    }
    System.out.println("| " + checkingAccount);
    System.out.println("----------------------------------------\n");
  }
}
