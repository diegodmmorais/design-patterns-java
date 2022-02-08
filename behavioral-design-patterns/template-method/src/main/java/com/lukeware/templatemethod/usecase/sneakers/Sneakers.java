package com.lukeware.templatemethod.usecase.sneakers;

import com.lukeware.templatemethod.usecase.Confection;

/**
 * @author Diego Morais
 */
final class Sneakers extends Confection implements ISneakers {
  @Override
  protected void toSew() {
    System.out.println("| sewing the sneakers");
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
    return false;
  }

  @Override
  protected void wash() {
  }

  @Override
  protected void label() {
    System.out.println("| tagging the sneakers");
  }

  @Override
  protected void send() {
    System.out.println("| Finishing the sneakers sneakers");
  }

  @Override
  protected void cut() {
    System.out.println("| cutting the sneakers");
  }
}
