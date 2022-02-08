package com.lukeware.strategy.entity.payment;

/**
 * @author Diego Morais
 */
public final class BankSlipPayment implements IPayment {
  private final int amount;
  private double installmentsValue;

  public BankSlipPayment(int amount) {
    this.amount = amount;
  }


  @Override
  public void calculatePayInstallments(double total) {
    this.installmentsValue = (total / amount);
  }

  @Override
  public String formOfPayment() {
    return "Bank Slip";
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
    return String.format("%s", 0.0).concat("%");
  }

}
