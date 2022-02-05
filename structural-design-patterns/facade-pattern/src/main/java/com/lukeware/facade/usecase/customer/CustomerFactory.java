package com.lukeware.facade.usecase.customer;

import java.util.Objects;

/**
 * @author
 */
public class CustomerFactory {

  private static CustomerFactory instance;

  private CustomerFactory() {
    super();
  }

  public static CustomerFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (CustomerFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new CustomerFactory();
        }
      }
    }
    return instance;
  }


  public ICustomerInteractor create() {
    return new CustomerInteractor();
  }

}
