package com.lukeware.facade.usecase.product;

import com.lukeware.facade.entity.product.IProduct;

/**
 * @author Diego Morais
 */
public interface IProductInteractor {
  IProduct findByIdenfifiercode(String identifierCode);
}
