package com.lukeware.templatemethod.usecase.tshirt;

/**
 * @author Diego Morais
 */
public class TShirtBuilder {

  private TShirtBuilder() {
    super();
  }

  public static TShirtBuilder builder() {
    return new TShirtBuilder();
  }

  public ITShirt build() {
    return new TShirt();
  }
}
