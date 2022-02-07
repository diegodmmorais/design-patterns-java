package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.usecase.RuleType;
import com.lukeware.observer.usecase.rule.event.EventListenRules;

/**
 * @author diegomorais
 */
public record RuleDsModule(String identifierCode, RuleType ruleType, EventListenRules eventListenRules) {
}
