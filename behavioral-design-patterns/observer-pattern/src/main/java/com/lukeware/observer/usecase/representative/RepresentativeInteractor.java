package com.lukeware.observer.usecase.representative;

import com.lukeware.observer.entity.action.ActionBuilder;
import com.lukeware.observer.entity.action.TypeAction;
import com.lukeware.observer.entity.representative.IRepresentative;
import com.lukeware.observer.usecase.AbstractRuleInteractor;
import com.lukeware.observer.usecase.RuleType;
import com.lukeware.observer.usecase.rule.event.RuleEventManager;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author Diego Morais
 */
final class RepresentativeInteractor extends AbstractRuleInteractor implements IRuleRepresentative {

  private final IRepresentative representative;
  private final RuleEventManager eventManager;

  RepresentativeInteractor(IRepresentative representative) {
    super(new LinkedHashSet<>());
    this.representative = representative;
    this.eventManager = RuleEventManager.getInstance();

  }

  @Override
  public void execute() {
    System.out.println("----------------------------------------");
    System.out.println("| Running rules representative");
    if (Objects.nonNull(representative.identifierDocument())) {
      System.out.println("| Identifier document validated");
      actions().add(ActionBuilder.builder().action("VALIDATE_IDENTIFIER_DOCUMENT")
                                 .type(TypeAction.GO_TO_AGENCY)
                                 .build());
      eventManager.notify(RuleType.REPRESENTATIVE, this.actions());
    }
    System.out.println("| " + representative);
    System.out.println("----------------------------------------\n");
  }

}
