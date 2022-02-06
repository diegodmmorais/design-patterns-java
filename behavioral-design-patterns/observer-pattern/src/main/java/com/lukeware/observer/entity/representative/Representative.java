package com.lukeware.observer.entity.representative;

/**
 * @author Diego Morais
 */
final record Representative(String identifierDocument,
                            String firstName,
                            String lastName) implements IRepresentative {
}
