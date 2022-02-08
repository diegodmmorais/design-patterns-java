package com.lukeware.strategy.entity.payment;

/**
 * @author Diego Morais
 */
public final class CreditCardPayment implements IPayment {
  private final int amount;
  private final double tax;
  private double installmentsValue;

  public CreditCardPayment(int amount, double tax) {
    this.amount = amount;
    this.tax = tax;
  }

  @Override
  public void calculatePayInstallments(double total) {
    final var result = total / amount;
    this.installmentsValue = result + (result * (this.tax / 100));
  }

  @Override
  public String formOfPayment() {
    return "Credit Card";
  }

  @Override
  public String numberOfInstallments() {
    return String.format("%sX", amount);
  }

  @Override
  public String installmentsValue() {
    return String.format("R$ %s", this.installmentsValue);
  }

  @Override
  public String totalTax() {
    return String.format("R$ %s", this.installmentsValue * this.amount);
  }

  @Override
  public String tax() {
    return String.format("%s", this.tax).concat("%");
  }

}
