package com.lukeware.templatemethod.usecase.shirt;

import com.lukeware.templatemethod.usecase.Confection;

/**
 * @author Diego Morais
 */
final class Shirt extends Confection implements IShirt {

  @Override
  protected void toSew() {
    System.out.println("| sewing the shirt");
  }

  @Override
  protected void iron() {
    System.out.println("| ironing the shirt");
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

