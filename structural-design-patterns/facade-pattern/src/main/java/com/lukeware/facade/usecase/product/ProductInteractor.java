package com.lukeware.facade.usecase.product;

import com.lukeware.facade.entity.product.IProduct;
import com.lukeware.facade.entity.product.ProductBuilder;

/**
 * @author Diego Morais
 */
final record ProductInteractor() implements IProductInteractor {

  @Override
  public IProduct findByIdenfifiercode(String identifierCode) {
    final var productName = "product " + identifierCode;
    System.out.println(String.format("Product found %s.", productName));
    return ProductBuilder.builder().name(productName).identifierCode(identifierCode).build();
  }

}
