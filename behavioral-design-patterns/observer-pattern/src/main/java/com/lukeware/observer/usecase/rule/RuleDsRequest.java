package com.lukeware.observer.usecase.rule;

import com.lukeware.observer.usecase.rule.event.EventListenRules;

/**
 * @author diegomorais
 */
public record RuleDsRequest(String identifierCode, EventListenRules eventListenRules) {
}
