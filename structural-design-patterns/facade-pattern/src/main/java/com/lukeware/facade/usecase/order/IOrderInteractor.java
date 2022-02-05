package com.lukeware.facade.usecase.order;

import com.lukeware.facade.entity.order.IOrder;

/**
 * @author Diego Morais
 */
public interface IOrderInteractor {
  void save(IOrder order);
}
