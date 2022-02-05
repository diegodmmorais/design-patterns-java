package com.lukeware.facade.usecase.customer;

import com.lukeware.facade.entity.customer.ICustomer;

/**
 * @author Diego Morais
 */
public interface ICustomerInteractor {
  ICustomer findName(String name);
}
