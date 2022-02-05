package com.lukeware.facade.entity.customer;

/**
 * @author Diego Morais
 */
public record Customer(String identifierDocument, String name) implements ICustomer {
}
