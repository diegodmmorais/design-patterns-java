package com.lukeware.templatemethod.usecase.shirts;

/**
 * @author
 */
public final class ShirtsBuilder {

  private ShirtsBuilder() {
    super();
  }

  public static ShirtsBuilder builder() {
    return new ShirtsBuilder();
  }

  public IShirts build() {
    return new Shirts();
  }
}
