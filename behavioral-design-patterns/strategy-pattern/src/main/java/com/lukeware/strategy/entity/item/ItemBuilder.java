package com.lukeware.strategy.entity.item;

/**
 * @author Diego Morais
 */
public class ItemBuilder {
  double price;

  private ItemBuilder() {
    super();
  }

  public static ItemBuilder builder() {
    return new ItemBuilder();
  }

  public ItemBuilder price(double price) {
    this.price = price;
    return this;
  }

  public IItem build() {
    return new Item(this.price);
  }


}
