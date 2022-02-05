package com.lukeware.facade.entity.item;

import com.lukeware.facade.entity.product.IProduct;

/**
 * @author Diego Morais
 */
public interface IItem {
  IProduct product();

  double price();

}
