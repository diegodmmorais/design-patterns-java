package com.lukeware.templatemethod.usecase.tshirt;

import com.lukeware.templatemethod.usecase.Confection;

/**
 * @author Diego Morais
 */
final class TShirt extends Confection implements ITShirt {
  @Override
  protected void toSew() {
    System.out.println("| sewing the t-shirt");
  }

  @Override
  protected void iron() {
    System.out.println("| ironing the t-shirt");
  }

  @Override
  protected void wash() {
    System.out.println("| washing the t-shirt");
  }

  @Override
  protected void label() {
    System.out.println("| tagging the t-shirt");
  }

  @Override
  protected void send() {
    System.out.println("| finishing the t-shirt making");
  }

  @Override
  protected void cut() {
    System.out.println("| cutting the t-shirt");
  }

  @Override
  public void make() {
    super.make();
  }
}
