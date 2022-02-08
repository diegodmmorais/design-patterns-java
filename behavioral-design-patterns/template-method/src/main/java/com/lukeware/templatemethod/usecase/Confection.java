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
    if (isIron()) {
      this.iron();
    }
    if (this.isWash()) {
      this.wash();
    }
    this.label();
    this.send();
    System.out.println("-------------------------------------");
  }

  protected abstract void toSew();

  protected abstract boolean isIron();

  protected abstract void iron();

  protected abstract boolean isWash();

  protected abstract void wash();

  protected abstract void label();

  protected abstract void send();

  protected abstract void cut();


}
