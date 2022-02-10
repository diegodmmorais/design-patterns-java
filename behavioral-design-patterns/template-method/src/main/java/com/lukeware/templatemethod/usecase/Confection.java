package com.lukeware.templatemethod.usecase;

/**
 *
 */
public abstract class Confection implements IConfection {
  @Override
  public void make() {
    System.out.println("-------------------------------------");
    this.cut();
    this.toSew();
    this.iron();
    this.wash();
    this.label();
    this.send();
    System.out.println("-------------------------------------");
  }

  protected abstract void toSew();

  protected abstract void iron();

  protected abstract void wash();

  protected abstract void label();

  protected abstract void send();

  protected abstract void cut();


}
