package com.lukeware.facade.entity.product;

/**
 * @author Diego Morais
 */
public final class ProductBuilder {

  String name;
  String identifierCode;

  private ProductBuilder() {
    super();
  }

  public static ProductBuilder builder() {
    return new ProductBuilder();
  }

  public ProductBuilder name(String name) {
    this.name = name;
    return this;
  }

  public ProductBuilder identifierCode(String identifierCode) {
    this.identifierCode = identifierCode;
    return this;
  }

  public IProduct build() {
    return new Product(this.identifierCode, this.name);
  }

}
