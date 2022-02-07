package com.lukeware.observer.usecase.rule.event;

import com.lukeware.observer.entity.action.IAction;
import com.lukeware.observer.usecase.RuleType;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Diego Morais
 */
public final class RuleEventManager {

  private static RuleEventManager instance;

  private Set<Map<RuleType, EventListenRules>> listeners = new LinkedHashSet<>();

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

  public void subscribe(EventListenRules listener, RuleType... type) {

    Stream.of(type).forEach(ruleType -> {
      final var optListener = listeners.stream()
                                       .filter(event -> event.containsKey(ruleType))
                                       .findFirst();
      if (optListener.isPresent()) {
        optListener.get().put(ruleType, listener);
      } else {
        listeners.add(Collections.singletonMap(ruleType, listener));
      }
    });

  }

  public void unSubscribe(RuleType type, EventListenRules listener) {
    final var optListener = listeners.stream()
                                     .filter(event -> event.containsKey(type))
                                     .findFirst();
    if (optListener.isPresent()) {
      listeners.remove(Collections.singletonMap(type, listener));
    }
  }

  public void notify(RuleType type, Set<IAction> actions) {
    listeners.forEach(rules -> rules.entrySet()
                                    .stream()
                                    .filter(event -> event.getKey().equals(type))
                                    .forEach(event -> event.getValue().update(type, actions)));
  }

}
