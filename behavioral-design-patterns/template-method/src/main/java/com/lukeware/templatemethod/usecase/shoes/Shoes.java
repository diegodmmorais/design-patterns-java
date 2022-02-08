package com.lukeware.templatemethod.usecase.shoes;

import com.lukeware.templatemethod.usecase.Confection;

/**
 * @author Diego Morais
 */
final class Shoes extends Confection implements IShoes {
  @Override
  protected void toSew() {
    System.out.println("| sewing the shoes");
  }

  @Override
  protected boolean isIron() {
    return false;
  }

  @Override
  protected void iron() {
  }

  @Override
  protected boolean isWash() {
    return true;
  }

  @Override
  protected void wash() {
    System.out.println("| washing the shoes");
  }

  @Override
  protected void label() {
    System.out.println("| tagging the shoes");
  }

  @Override
  protected void send() {
    System.out.println("| Finishing the shoes making");
  }

  @Override
  protected void cut() {
    System.out.println("| cutting the shoes");
  }
}
