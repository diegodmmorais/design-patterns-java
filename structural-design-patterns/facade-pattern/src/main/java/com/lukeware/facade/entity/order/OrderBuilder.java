package com.lukeware.facade.entity.order;

import com.lukeware.facade.entity.customer.ICustomer;
import com.lukeware.facade.entity.item.IItem;

import java.util.Set;

/**
 * @author Diego Morais
 */
public final class OrderBuilder {

  ICustomer customer;
  Set<IItem> items;

  private OrderBuilder() {
    super();
  }

  public static OrderBuilder builder() {
    return new OrderBuilder();
  }

  public OrderBuilder items(Set<IItem> items) {
    this.items = items;
    return this;
  }

  public OrderBuilder customer(ICustomer customer) {
    this.customer = customer;
    return this;
  }

  public IOrder build() {
    return new Order(this.customer, this.items);
  }

}
