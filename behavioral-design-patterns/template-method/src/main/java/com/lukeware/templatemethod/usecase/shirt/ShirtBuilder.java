package com.lukeware.templatemethod.usecase.shirt;

/**
 * @author
 */
public final class ShirtBuilder {

  private ShirtBuilder() {
    super();
  }

  public static ShirtBuilder builder() {
    return new ShirtBuilder();
  }

  public IShirt build() {
    return new Shirt();
  }
}
