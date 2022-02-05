package com.lukeware.facade.usecase.order;

import com.lukeware.facade.entity.order.IOrder;

/**
 * @author Diego Morais
 */
final record OrderInteractor() implements IOrderInteractor {

  @Override
  public void save(IOrder order) {
    System.out.println();
    System.out.println(order);
    System.out.println();
    System.out.println("Order save!");
    System.out.println();
  }

}
