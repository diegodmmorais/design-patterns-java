package com.lukeware.strategy.entity.payment;

/**
 * @author Diego Morais
 */
public interface IPayment {
  void calculatePayInstallments(double total);

  String formOfPayment();

  String numberOfInstallments();

  String installmentsValue();

  String totalTax();

  String tax();
}
