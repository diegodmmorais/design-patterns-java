package com.lukeware.observer.usecase.rule.event;

import com.lukeware.observer.entity.action.IAction;
import com.lukeware.observer.usecase.rule.RuleDsRequest;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Diego Morais
 */
public final class RuleEventManager {

  private static RuleEventManager instance;

  private Set<RuleDsRequest> listeners = new LinkedHashSet<>();

  private RuleEventManager() {
    super();
  }

  public static RuleEventManager getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (RuleEventManager.class) {
        if (Objects.isNull(instance)) {
          instance = new RuleEventManager();
        }
      }
    }
    return instance;
  }

  public void subscribe(String identifierCode, EventListenRules eventList) {
    listeners.add(new RuleDsRequest(identifierCode, eventList));
  }

  public void unsubscribe(String identifierCode) {
    final var optListener = listeners.stream()
                                     .filter(event -> event.identifierCode().equals(identifierCode))
                                     .findFirst();
    if (optListener.isPresent()) {
      listeners.remove(optListener.get());
    }
    System.gc();
  }

  public void notify(String identifierCode, Set<IAction> actions) {
    listeners.stream().filter(item -> item.identifierCode().equals(identifierCode))
             .findFirst()
             .ifPresent(rule -> rule.eventListenRules().update(actions));
  }

}
