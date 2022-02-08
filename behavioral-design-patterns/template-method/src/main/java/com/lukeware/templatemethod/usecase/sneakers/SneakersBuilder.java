package com.lukeware.templatemethod.usecase.sneakers;

/**
 * @author Diego Morais
 */
public class SneakersBuilder {
  private SneakersBuilder() {
    super();
  }

  public static SneakersBuilder builder() {
    return new SneakersBuilder();
  }

  public ISneakers build() {
    return new Sneakers();
  }
}
