package com.lukeware.facade.entity.item;

import com.lukeware.facade.entity.product.IProduct;

/**
 * @author Diego Morais
 */
public final class ItemBuilder {

  private IProduct product;
  private double price;

  private ItemBuilder() {
    super();
  }

  public static ItemBuilder builder() {
    return new ItemBuilder();
  }

  public ItemBuilder product(IProduct product) {
    this.product = product;
    return this;
  }

  public ItemBuilder price(double price) {
    this.price = price;
    return this;
  }

  public IItem build() {
    return new Item(this.product, this.price);
  }

}
