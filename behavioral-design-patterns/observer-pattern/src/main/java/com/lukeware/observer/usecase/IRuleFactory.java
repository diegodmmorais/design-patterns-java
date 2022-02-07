package com.lukeware.observer.usecase;

/**
 * @param <T>
 * @author Diego Morais
 */
public interface IRuleFactory<I, O> {
  O create(String identifierProposal, I i);
}
