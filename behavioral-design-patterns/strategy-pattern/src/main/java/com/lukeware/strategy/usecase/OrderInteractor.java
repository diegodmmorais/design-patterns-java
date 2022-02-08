package com.lukeware.strategy.usecase;

import com.lukeware.strategy.entity.order.IOrder;

/**
 *
 */
final record OrderInteractor() {

  public void finishOrder(IOrder order) {
    order.calculatePayInstallments();
    order.resume();
  }

}
