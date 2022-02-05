package com.lukeware.facade.usecase;

import com.lukeware.facade.usecase.customer.ICustomerInteractor;
import com.lukeware.facade.usecase.order.IOrderInteractor;
import com.lukeware.facade.usecase.product.IProductInteractor;

import java.util.Objects;

/**
 * @author diegomorais
 */
public final class OrdeFacadeFactory {

  private static OrdeFacadeFactory instance;

  private OrdeFacadeFactory() {
    super();
  }

  public static OrdeFacadeFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (OrdeFacadeFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new OrdeFacadeFactory();
        }
      }
    }
    return instance;
  }


  public IOrderFacade create(final ICustomerInteractor customerInteractor,
                             final IProductInteractor productInteractor,
                             final IOrderInteractor orderInteractor) {
    return new OrderFacade(customerInteractor, productInteractor, orderInteractor);
  }
}
