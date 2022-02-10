package com.lukeware.templatemethod.usecase.blouse;

/**
 * @author Diego Morais
 */
public class BlouseBuilder {
  private BlouseBuilder() {
    super();
  }

  public static BlouseBuilder builder() {
    return new BlouseBuilder();
  }

  public IBlouse build() {
    return new Blouse();
  }
}
