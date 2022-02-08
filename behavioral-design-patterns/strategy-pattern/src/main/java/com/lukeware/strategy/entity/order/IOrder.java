package com.lukeware.strategy.entity.order;

import com.lukeware.strategy.entity.payment.IPayment;
import com.lukeware.strategy.entity.item.IItem;

import java.util.Set;

/**
 * @author Diego Morais
 */
public interface IOrder {

  Set<IItem> items();

  IPayment payment();

  void calculatePayInstallments();

  void resume();
}
