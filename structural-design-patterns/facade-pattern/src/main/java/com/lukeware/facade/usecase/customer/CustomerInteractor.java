package com.lukeware.facade.usecase.customer;

import com.lukeware.facade.entity.customer.CustomerBuilder;
import com.lukeware.facade.entity.customer.ICustomer;

/**
 * @author Diego Morais
 */
final record CustomerInteractor() implements ICustomerInteractor {

  @Override
  public ICustomer findName(String name) {
    System.out.println(String.format("Customer found %s.", name));
    final var identifierDocument = String.valueOf(Double.valueOf(Math.floor(Math.random() * 9999)).intValue());
    return CustomerBuilder.builder().name(name).identifierDocument(identifierDocument).build();
  }

}
