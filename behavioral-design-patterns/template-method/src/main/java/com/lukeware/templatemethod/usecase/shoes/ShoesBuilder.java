package com.lukeware.templatemethod.usecase.shoes;

/**
 * @author Diego Morais
 */
public class ShoesBuilder {

  private ShoesBuilder() {
    super();
  }

  public static ShoesBuilder builder() {
    return new ShoesBuilder();
  }

  public IShoes build() {
    return new Shoes();
  }
}
