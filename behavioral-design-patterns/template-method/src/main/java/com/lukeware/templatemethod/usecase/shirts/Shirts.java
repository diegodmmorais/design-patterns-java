package com.lukeware.templatemethod.usecase.shirts;

import com.lukeware.templatemethod.usecase.Confection;

/**
 * @author Diego Morais
 */
final class Shirts extends Confection implements IShirts {

  @Override
  protected void toSew() {
    System.out.println("| sewing the shirt");
  }

  @Override
  protected boolean isIron() {
    return true;
  }

  @Override
  protected void iron() {
    System.out.println("| ironing the shirt");
  }

  @Override
  protected boolean isWash() {
    return true;
  }

  @Override
  protected void wash() {
    System.out.println("| washing the shirt");
  }

  @Override
  protected void label() {
    System.out.println("| tagging the shirt");
  }

  @Override
  protected void send() {
    System.out.println("| finishing the shirt making");
  }

  @Override
  protected void cut() {
    System.out.println("| cutting the shirt");
  }

  @Override
  public void make() {
    super.make();
  }

}

