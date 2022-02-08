package com.lukeware.strategy.entity.order;

import com.lukeware.strategy.entity.payment.IPayment;
import com.lukeware.strategy.entity.item.IItem;

import java.util.Set;

/**
 * @author Diego Morais
 */
final record Order(Set<IItem> items, IPayment payment) implements IOrder {

  @Override
  public void calculatePayInstallments() {
    final var total = getSum();
    this.payment.calculatePayInstallments(total);
  }

  @Override
  public void resume() {
    System.out.println("--------------------------------------");
    System.out.println("| quantity of items: " + this.items.size());
    System.out.println("| Total value: R$ " + this.getSum());
    System.out.println("| Tax value: " + this.payment.tax());
    System.out.println("| Form of payment: " + this.payment.formOfPayment());
    System.out.println("| Form of pay installments: " + this.payment.numberOfInstallments());
    System.out.println("| Value installments: " + this.payment.installmentsValue());
    System.out.println("| Total value whit tax: " + this.payment.totalTax());
    System.out.println("--------------------------------------");
  }

  private double getSum() {
    return this.items.stream().mapToDouble(item -> item.price()).sum();
  }
}
