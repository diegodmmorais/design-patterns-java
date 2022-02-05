package com.lukeware.facade.usecase.order;

import java.util.Objects;

/**
 * @author
 */
public class OrderFactory {

  private static OrderFactory instance;

  private OrderFactory() {
    super();
  }

  public static OrderFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (OrderFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new OrderFactory();
        }
      }
    }
    return instance;
  }


  public IOrderInteractor create() {
    return new OrderInteractor();
  }

}
