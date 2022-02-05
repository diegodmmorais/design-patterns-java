package com.lukeware.facade.entity.order;

import com.lukeware.facade.entity.customer.ICustomer;
import com.lukeware.facade.entity.item.IItem;

import java.util.Set;

/**
 * @author Diego Morais
 */
public interface IOrder {
  ICustomer customer();

  Set<IItem> items();
}
