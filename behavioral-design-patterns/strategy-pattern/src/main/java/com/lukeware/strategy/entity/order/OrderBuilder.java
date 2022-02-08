package com.lukeware.strategy.entity.order;

import com.lukeware.strategy.entity.item.IItem;
import com.lukeware.strategy.entity.payment.IPayment;

import java.util.Set;

/**
 * @author Diego Morais
 */
public class OrderBuilder {
  private Set<IItem> items;
  private IPayment payment;

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

  public OrderBuilder payment(IPayment payment) {
    this.payment = payment;
    return this;
  }

  public IOrder build() {
    return new Order(this.items, this.payment);
  }


}
