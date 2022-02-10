package com.lukeware.templatemethod.usecase.blouse;

import com.lukeware.templatemethod.usecase.Confection;

/**
 * @author Diego Morais
 */
final class Blouse extends Confection implements IBlouse {
  @Override
  protected void toSew() {
    System.out.println("| sewing the blouse");
  }

  @Override
  protected void iron() {
    System.out.println("| ironing the blouse");
  }

  @Override
  protected void wash() {
    System.out.println("| washing the blouse");
  }

  @Override
  protected void label() {
    System.out.println("| tagging the blouse");
  }

  @Override
  protected void send() {
    System.out.println("| finishing the blouse making");
  }

  @Override
  protected void cut() {
    System.out.println("| cutting the blouse");
  }

  @Override
  public void make() {
    super.make();
  }
}
